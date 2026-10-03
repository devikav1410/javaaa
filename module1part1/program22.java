    // 1. Get the size of the array
    System.out.print("Enter the number of elements in the array: ");
    int size = scanner.nextInt();
    
    // Edge case: Handle empty array
    if (size <= 0) {
        System.out.println("The array must contain at least 1 element.");
        scanner.close();
        return;
    }
    
    int[] numbers = new int[size];
    int sum = 0;
    
    // 2. Take array elements as input and calculate sum
    System.out.println("Enter " + size + " integers:");
    for (int i = 0; i < size; i++) {
        numbers[i] = scanner.nextInt();
        sum += numbers[i]; // Accumulate the total
    }
    
    scanner.close();
    
    // 3. Calculate the average using type casting to preserve decimals
    double average = (double) sum / size;
    
    // 4. Output the results
    System.out.println("Sum of elements: " + sum);
    System.out.println("Average of elements: " + average);
}
