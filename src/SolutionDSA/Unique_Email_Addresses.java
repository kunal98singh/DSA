package SolutionDSA;

import java.util.HashSet;

public class Unique_Email_Addresses {
     public int numUniqueEmails(String[] emails) {
        HashSet<String> uniqueEmails = new HashSet<>();
        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove everything after the first '+' in the local part
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Remove all '.' characters from the local part
            local = local.replace(".", "");

            // Reconstruct the email
            String uniqueEmail = local + "@" + domain;
            uniqueEmails.add(uniqueEmail);

   
    }

        // Return the number of unique emails
        return uniqueEmails.size();



}
}
