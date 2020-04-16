package domain;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FieldTest {

    Field field1 = new Field("Metallurg", 200);
    Field field2 = new Field("Dinamo", 999);

    
    @Test
    void getFieldName() {
        assertEquals("Metallurg", field1.getFieldName());
        assertEquals("Dinamo", field2.getFieldName());
    }

    @Test
    void setFieldName() {
        assertTrue(field1.setFieldName("Zenit"));
        assertFalse(field1.setFieldName(""));
    }

    @Test
    void getPropertyCost() {
        assertEquals(200, field1.getPropertyCost());
        assertEquals(999, field2.getPropertyCost());
    }

    @Test
    void setPropertyCost() {
        assertTrue(field1.setPropertyCost(111));
        assertFalse(field1.setPropertyCost(-1));
    }
}