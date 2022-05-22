package lesson11;

public class UserInputService {

    private String[] memory;

    public UserInputService() {
        this.memory = new String[5];
    }

    public void processingInput(String str) throws Finish, Empty, Full {
        switch (str) {
            case "get":
                if (memory[0] == null) {throw new Empty();}
                else {
                    System.out.println(memory[0]);
                    deleteFirst();
                }
                break;
            case "exit":
                throw new Finish();
            default:
                addValue(str);
                break;
        }
    }

    private void deleteFirst() {
        for (int i = 0; i < memory.length - 1 && memory[i] != null; i++) {
            memory[i] = memory[i + 1];
        }
        memory[memory.length - 1] = null;
    }

    private void addValue(String str) throws Full {
        if (memory[memory.length - 1] != null) {throw new Full();}
        else {
            for (int i = 0; i < memory.length; i++) {
                if (memory[i] == null) {
                    memory[i] = str;
                    break;
                }
            }
        }
    }
}
