package splab.command;

import org.springframework.stereotype.Component;

@Component
public class CommandExecutor {
    public Object execute(Command command) {
        return command.execute();
    }
}

