package sample.Util;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.control.TextField;

import java.text.NumberFormat;

public class NumberTextField extends TextField {



    public NumberTextField() { this(0); }
    public NumberTextField(Integer value){
        this(value, NumberFormat.getInstance());
        initHandlers();
    }
    private NumberTextField(Integer value, NumberFormat nf) {
        super();
        this.nf = nf;
        initHandlers();
//        setNumber(value);
    }

    public boolean isOutOfRange(){
        return _number.getValue() > _max || _number.getValue() < _min;
    }

    public void setRange(int min, int max) {
        _max = max;
        _min = min;
    }
    /**
     * the  method to initial the Handlers
     */
    private void initHandlers() {}
    public Integer getNumber(){ return _number.get();}

    /**
     * get the rang of number
     * @return a string that show the range
     */
    public String getRange() {
        return "[" + _min + ", " + _max + "]";
    }


    private int _min;
    private int _max;
    private final NumberFormat nf;
    private ObjectProperty<Integer> _number = new SimpleObjectProperty<>();
}
