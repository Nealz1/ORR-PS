## 📦 Project Structure

- `Server.java` - Starts and registers remote matrix agents
- `Client.java` - Sends matrix input and receives result
- `AgentImpl.java` - Agent that performs one matrix cell computation
- `MatrixTask.java` - Remote interface shared between client/server/agents

---

## ▶️ How to Run

### 1. Build the project (Project -> Build -> Build Project)
### 2. Start RMI Registry

```bash
cd out/production/{project name}
rmiregistry
```

### 3. Start Server
Either green arrow or run compiled Server.class
```bash
java Server
```
### 4. Start Client
Either green arrow or run compiled Client.class
```bash
java Client
```
