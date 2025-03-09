# :airplane: Credit Rewards Converter :airplane:

## Overview

The Rewards Converter project is a simple self-contained Java application that converts credit card reward points between cash and airline miles. It consists of three main components:

`RewardValue Class` - Handles conversion between cash and miles.

`RewardsConverter Class` - Provides a command-line interface for user input and conversion.

`RewardValueTests Class` - Unit tests for validating the conversion logic.

## Features

- Convert cash value to airline miles.

- Convert miles to cash value.

- User-friendly command-line interface.

- Unit tests to ensure accuracy of conversions.

## Files

### 1. RewardValue.java

This class represents the conversion between cash and miles.

### Methods:

- `RewardValue(double cashValue)` - Constructor that initializes with cash value.

- `RewardValue(int milesValue)` - Constructor that initializes with miles value.

- `getCashValue()` - Returns the cash equivalent.

- `getMilesValue()` - Returns the miles equivalent.

### 2. RewardsConverter.java

This is the main class that interacts with the user through the command line.

### Flow:

- Prompts the user to enter a cash value.

- Converts the cash to miles using the RewardValue class.

- Displays the equivalent miles.

### 3. RewardValueTests.java

This file contains unit tests to verify the correctness of conversion logic using JUnit 5.

### Test Cases:

- `create_with_cash_value()` - Checks if cash value is correctly stored.

- `create_with_miles_value()` - Checks if miles value is correctly stored.

- `convert_from_cash_to_miles()` - Validates cash-to-miles conversion.

- `convert_from_miles_to_cash()` - Validates miles-to-cash conversion.

## Usage

### Running the Application

- Compile the Java files:

```sh
javac RewardValue.java RewardsConverter.java
```

- Run the program:

```sh
java RewardsConverter
```

- Enter a cash value to see its miles equivalent.

### Running Tests

- Ensure you have JUnit 5 installed, then run:

```sh
mvn test
```

## Conversion Formula

Miles to Cash: cashValue = `milesValue * 0.0035`

Cash to Miles: milesValue = `cashValue / 0.0035`

## Dependencies

- Java 8 or higher

- JUnit 5 for testing
