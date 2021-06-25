package guru.springframework.gof.creational.prototype;

public class NDAgreement extends PrototypeCapableDocument {
    private AuthorizedSignatory authorizedSignatory;

    @Override
    public PrototypeCapableDocument cloneDocument() throws CloneNotSupportedException {
        //Clone with deep copy
        NDAgreement nda;
        nda = (NDAgreement) super.clone();
        AuthorizedSignatory clonedAuthorizedSignatory = (AuthorizedSignatory) nda.getAuthorizedSignatory().clone();
        nda.setAuthorizedSignatory(clonedAuthorizedSignatory);
        return nda;
    }

    public AuthorizedSignatory getAuthorizedSignatory() {
        return authorizedSignatory;
    }

    public void setAuthorizedSignatory(AuthorizedSignatory authorizedSignatory) {
        this.authorizedSignatory = authorizedSignatory;
    }

    @Override
    public String toString() {
        return "[NDAgreement: Vendor Name - " + getVendorName() + ", Content - "
                + getContent() + ", Authorized Signatory - " + getAuthorizedSignatory() + "]";
    }
}
