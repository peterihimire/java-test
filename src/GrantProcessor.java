import java.util.*;
//Kelvin@vibesmeet.com

   public class GrantProcessor {

      record GrantEvent(
          String eventId,
          String grantId,
          long sequence,
          String status
      ) {
      }

      public static Map<String, String> latestStatus(
          List<GrantEvent> events) {
        // TODO: Implement
        Map<String, String> latestStatuses = new LinkedHashMap<>();
        Map<String, Long> latestSequence = new HashMap<>();
        Set<String> processedEventIds = new HashSet<>();

        if (events == null || events.isEmpty()) {
          return latestStatuses;
        }

        for (GrantEvent event : events) {
          if (event == null) {
            continue;
          }

          if (isBlank(event.eventId())
              || isBlank(event.grantId())
              || isBlank(event.status())
              || event.sequence() < 0) {
            continue;
          }

          if (!processedEventIds.add(event.eventId())) {
            continue;
          }

          String grantId = event.grantId();
          long sequence = event.sequence();

          if (!latestStatuses.containsKey(grantId)) {
            latestStatuses.put(grantId, event.status());
            latestSequence.put(grantId, sequence);
            continue;
          }

          if (sequence > latestSequence.get(grantId)) {
            latestStatuses.put(grantId, event.status());
            latestSequence.put(grantId, sequence);
          }
        }


        return latestStatuses;
      }

      private static boolean isBlank(String value) {
        return value == null || value.isBlank();
      }

      public static void main(String[] args) {
        List<GrantEvent> events =  Arrays.asList(
            new GrantEvent("E1", "G100", 1, "APPROVED"),
            new  GrantEvent("E2","G200", 2,"IN_REVIEW" )
        );

        Map<String, String> result = latestStatus(events);

        System.out.println(result);

      }
    }
