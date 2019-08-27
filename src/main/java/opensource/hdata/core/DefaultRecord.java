package opensource.hdata.core;

import opensource.hdata.core.plugin.Record;

public class DefaultRecord implements Record {

    private Object[] fields;
    private int cursor;

    public DefaultRecord(int fieldCount) {
        fields = new Object[fieldCount];
    }

    @Override
    public void addField(int index, Object field) {
        fields[index] = field;
        this.cursor++;
    }

    @Override
    public void addField(Object field) {
        addField(cursor, field);
    }

    @Override
    public Object getField(int index) {
        return fields[index];
    }

    @Override
    public int getFieldsCount() {
        return fields.length;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0, len = fields.length; i < len; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(fields[i]);
        }
        sb.append("}");
        return sb.toString();
    }

}
