 Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            String[] result = generateArray(n);

            // Print the result for the current test case
            for (int i = 0; i < result.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(result[i]);
            }
            System.out.println();
        }

        scanner.close();
    }

    private static String[] generateArray(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i - 1] = "Cipher";
            } else if (i % 3 == 0) {
                result[i - 1] = "Schools";
            } else {
                result[i - 1] = "CipherSchools";
            }
        }

        return result;
