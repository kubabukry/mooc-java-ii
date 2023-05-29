public class List <Type>{
    private Type[] values;
    private int firstFreeIndex;

    public List(){
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value){
        if(this.firstFreeIndex == this.values.length){
            grow();
        }
        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    private void grow(){
        Type[] newValues = (Type[]) new Object[this.firstFreeIndex+(this.firstFreeIndex/2)-1];
        for(int i=0; i<this.firstFreeIndex; i++){
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type value){
        return indexOfValue(value)>=0;      //if indexOfValue(value)>=0 returns true, false otherwise
    }

    public void remove(Type value){
        int indexOfValue = indexOfValue(value);
        if(indexOfValue<0){
            return;     //simply breaks from method
        }
        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    public int indexOfValue(Type value){
        for(int i=0; i<this.firstFreeIndex; i++){
            if(this.values[i].equals(value) && this.values[i] == value){
                return i;
            }
        }
        return -1;
    }

    private void moveToTheLeft(int fromIndex){
        for(int i=fromIndex; i<this.firstFreeIndex-1; i++){
            this.values[i] = this.values[i+1];
        }
    }

    public Type value(int index){
        if(index>-1 && index<this.firstFreeIndex){
            return this.values[index];
        }
        else{
            throw new ArrayIndexOutOfBoundsException("Index "+index+" exceeds the list's boundaries");
        }
    }

    public int size(){
        return this.firstFreeIndex;
    }

}
