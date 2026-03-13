package org.bouncycastle.cms;

import java.util.Map;
import org.bouncycastle.asn1.cms.AttributeTable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SimpleAttributeTableGenerator implements CMSAttributeTableGenerator {
    private final AttributeTable attributes;

    public SimpleAttributeTableGenerator(AttributeTable attributeTable) {
        this.attributes = attributeTable;
    }

    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
    public AttributeTable getAttributes(Map map) {
        return this.attributes;
    }
}
