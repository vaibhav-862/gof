package guru.springframework.gof.creational.prototype;

import org.junit.jupiter.api.Test;

class DocumentPrototypeManagerTest {

    @Test
    public void testGetClonedDocument() throws Exception {
        PrototypeCapableDocument clonedTAndC = DocumentPrototypeManager.getClonedDocument("tandc");
        clonedTAndC.setVendorName("Mary Parker");
        System.out.println(clonedTAndC);
        PrototypeCapableDocument clonedNDA = DocumentPrototypeManager.getClonedDocument("nda");
        clonedNDA.setVendorName("Patrick Smith");
        System.out.println(clonedNDA);
    }

}