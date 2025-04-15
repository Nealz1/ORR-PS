# 🧠 Java RMI - 2x2 Matrix Multiplication

This project demonstrates how to use Java RMI (Remote Method Invocation) to multiply two 2x2 matrices using distributed remote agents.

## 📦 Project Structure

- `Server.java` - Starts and registers remote matrix agents
- `Client.java` - Sends matrix input and receives result
- `AgentImpl.java` - Agent that performs one matrix cell computation
- `MatrixTask.java` - Remote interface shared between client/server/agents


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
