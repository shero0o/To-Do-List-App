import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import Package1.Task;

public class TaskItemListener implements ItemListener{
    private Task task;

    public TaskItemListener(Task task){
        this.task = task;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       if (e.getStateChange() == ItemEvent.SELECTED) {
            task.setComplete(true);
       }
       else{
            task.setComplete(false);
       }

    }

}
