package javajerry;

public class DayCare {
    
    public boolean findEmployeeForChild(Child c){
        for (int i = 0; i < employees.size(); i++){
            if (employees.get(i).canTeach(c.getAge())){
                if (employees.get(i).childrenAssigned() < maxRatio){
                    employees.assignChild(c);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean runDayCare(){
        for (int i = 0; i < children.size(); i++){
            if (findEmployeeForChild(children.get(i)) == false){
                return false;
            }
        }
        return true;
    }

    public boolean addChild(Child c) {
        if (findEmployeeForChild(c)){
            return children.add(c);
        }
        return false;
    }

}
