package cameratechreport;

public class CameraTechReport {

    public static void main(String[] args) {
         // Create a two-dimensional array to store the camera cost comparisons
       String[] cameraManufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500}, // Canon: [Mirrorless, DSLR]
            {9500, 7200},  // Sony: [Mirrorless, DSLR]
            {12000, 8000}  // Nikon: [Mirrorless, DSLR]
        };

        // Manufacturer with the greatest cost difference
        String maxManufacturerDifference = "";
        int maxDifference = 0;

        // Display the Camera Technology Report
        System.out.println("Camera Technology Report");
        System.out.println("Manufacturer\tMirrorless\tDSLR\tPrice Difference");

        for (int i = 0; i < cameraManufacturers.length; i++) {
            String manufacturer = cameraManufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int difference = mirrorlessPrice - dslrPrice;

            // Check if the difference between the Mirrorless camera and DSLR are greater than or equal to R2,500
            String stars = (difference >= 2500) ? "***" : "";

            if (difference > maxDifference) {
                maxDifference = difference;
                maxManufacturerDifference = manufacturer;
            }

            // Display the manufacturer and prices
            System.out.println(manufacturer + "\t\t" + mirrorlessPrice + "\t\t" + dslrPrice + "\t\t" + difference + stars);
        }

        // Display the manufacturer with the greatest cost difference
        System.out.println("\nThe manufacturer with the greatest cost difference is: " + maxManufacturerDifference);
    }
  }
    

