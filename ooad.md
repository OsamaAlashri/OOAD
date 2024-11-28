
# Task Management System - Use Case Specifications

## 1. Task Creation and Assignment

**Name:** Task Creation and Assignment  
**Actors:**  
- **Primary Actor:** Manager  
- **Supporting Actor:** Employee  
**Description:** Allows a manager to create a task and assign it to an employee.  

**Preconditions:**  
1. The manager must be logged in to the system.  
2. The employee to whom the task will be assigned exists in the system.  

**Postconditions:**  
1. The task is successfully saved in the database.  
2. The assigned employee is notified of the new task.  

**Main Flow:**  
1. Manager logs in.  
2. Manager selects "Create Task."  
3. Manager enters task details, including title, description, priority, and deadline.  
4. Manager assigns the task to an employee.  
5. System validates the input and saves the task.  
6. System notifies the assigned employee via the notification feature.  

**Alternate Flows:**  
1. If task details are incomplete:  
   - System prompts the manager to complete all required fields.  
2. If the employee is unavailable:  
   - System prompts the manager to select a different employee.  

**Triggers:**  
- Manager clicks the "Create Task" button.  

**Success Criteria:**  
- The task is created and assigned successfully, and the assigned employee is notified.  

**Failure Criteria:**  
- The system encounters a database error and cannot save the task.  
- The manager is not logged in and is redirected to the login page.

---

## 2. Task Progress Update

**Name:** Task Progress Update  
**Actors:**  
- **Primary Actor:** Employee  
**Description:** Allows an employee to update the progress of an assigned task.  

**Preconditions:**  
1. The employee must be logged in to the system.  
2. The task must be assigned to the employee.  
3. The task must not be marked as completed.  

**Postconditions:**  
1. The task's progress is updated in the database.  
2. The manager is notified of the update.  

**Main Flow:**  
1. Employee logs in.  
2. Employee views their assigned tasks.  
3. Employee selects a task to update progress.  
4. Employee enters the updated progress (e.g., 50% completed).  
5. System validates the input and updates the task in the database.  
6. System notifies the manager of the progress update.  

**Alternate Flows:**  
1. If the task is already marked as completed:  
   - System prevents progress updates and notifies the employee.  

**Triggers:**  
- Employee selects a task to update progress.  

**Success Criteria:**  
- The task progress is updated successfully, and the manager is notified.  

**Failure Criteria:**  
- The employee is not logged in and cannot access the task.  
- The task is marked as completed and cannot be updated.

---

## 3. Task Reporting

**Name:** Task Progress Reporting  
**Actors:**  
- **Primary Actor:** Manager  
**Description:** Allows a manager to generate reports on task progress and overall statistics.  

**Preconditions:**  
1. The manager must be logged in to the system.  

**Postconditions:**  
1. The manager receives a report with accurate task progress data.  

**Main Flow:**  
1. Manager logs in.  
2. Manager selects "Generate Report."  
3. Manager specifies report parameters (e.g., date range, team, task status).  
4. System retrieves relevant data from the database.  
5. System generates and displays the report to the manager.  

**Alternate Flows:**  
1. If no data is available for the specified parameters:  
   - System displays a message: "No data available for the selected criteria."  

**Triggers:**  
- Manager clicks the "Generate Report" button.  

**Success Criteria:**  
- The report is generated and displayed to the manager.  

**Failure Criteria:**  
- System fails to retrieve data from the database due to an error.

---

## How to Use the System

1. **Authentication:**
   - Managers and employees register and log in with secure credentials.  

2. **Task Management:**
   - Managers create and assign tasks.  
   - Employees view, accept/reject, and update task progress.  

3. **Reporting:**
   - Managers generate progress reports and view statistics.  

## Technical Requirements

- **Scalability:** Support up to 1,000 concurrent users.
- **Security:** All passwords encrypted, secure data transmission via HTTPS.
- **Performance:** System responses within 2 seconds.

---
