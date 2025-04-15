# 🧠 Java RMI - 2x2 Matrix Multiplication

This project demonstrates how to use Java RMI (Remote Method Invocation) to multiply two 2x2 matrices using distributed remote agents.

## 📦 Project Structure

- `src/Server.java` - Starts the RMI server and registers remote matrix agents.
- `src/AgentImpl.java` - Implements the agent logic to compute a single matrix element.
- `src/MatrixTask.java` - Remote interface defining the matrix multiplication task.
- `src/AgentTask.java` - Remote interface defining the agent's computation task.
- `src/Client.java` - Sends matrix input to the server and receives the result.

## ▶️ How to Run

### 1. Build the project (Project -> Build -> Build Project) and move to out directory
```bash
 cd out/production/{project name}
````
### 2. Start RMI Registry

```bash
 rmiregistry
```

### 3. Start Server
Either green arrow or run compiled Server.class
```bash
 java Server
```
### 4. Start Agents, each one in a different terminal
```bash
 java AgentImpl {number}
```

### 5. Start Client
```bash
 java Client
```
