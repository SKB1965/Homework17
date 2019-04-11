edu.dmacc.codedsm.hw17;

import.java.util.objects;

public class TaskPerformer<toDo> {

    private String toDo;
    private User office;
    private User trainees;

    public performTask(String toDo,User office,User trainees){
        this.toDo = toDo;
        this.office = office;
        this.trainees = trainees;
    }

    public String getToDo(){return toDo;}

    public void setToDo(String toDo){this.toDo = toDo;}

    public User getOffice(){return office;}

    public void setOffice(User office){this.office=office;}

    public User getTrainees(){return trainees;}
    public void setTrainees(User trainees){this.trainees=trainees;}


    public boolean equals(object object) {
        if (equals(true)) {
            return true;
        }
        else return false;

    }
}
