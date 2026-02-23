# Toll Booth Project

## Overview
This project manages the operation of toll booths, ensuring smooth vehicle passage and accurate toll collection. It includes a user-friendly interface for operators and a robust backend for processing data.

## Features
- Real-time toll tracking
- Reports on total tolls collected
- Vehicle classification (car, truck, etc.)
- Payment processing through multiple methods

## Database Structure

### Tables:

1. **TollBooths**  
   - **id**: INT, Primary Key  
   - **location**: VARCHAR(255)  
   - **status**: ENUM('active', 'inactive')  

2. **Vehicles**  
   - **id**: INT, Primary Key  
   - **license_plate**: VARCHAR(15)  
   - **type**: ENUM('car', 'truck', 'bus')  
   - **owner_id**: INT, Foreign Key to Owners  

3. **Tolls**  
   - **id**: INT, Primary Key  
   - **booth_id**: INT, Foreign Key to TollBooths  
   - **vehicle_id**: INT, Foreign Key to Vehicles  
   - **amount_collected**: DECIMAL(10, 2)  
   - **timestamp**: DATETIME  

4. **Payments**  
   - **id**: INT, Primary Key  
   - **toll_id**: INT, Foreign Key to Tolls  
   - **payment_method**: ENUM('cash', 'credit_card', 'debit_card')  
   - **amount**: DECIMAL(10, 2)  
   - **payment_status**: ENUM('completed', 'pending', 'failed')  

### Relationships:
- A TollBooth can process many Tolls.
- A Vehicle can be associated with many Tolls (e.g., if it passes through multiple booths).
- Each Toll can have one Payment record associated.

## Getting Started
### Installation
1. Clone the repository.
2. Set up the database using the provided structure.
3. Configure the server settings.
4. Launch the application.

## Contribution
We welcome contributions! Please submit pull requests and issues for proposed changes or improvements.

## License
This project is licensed under the MIT License.