package org.bouncycastle.cms;

import com.stub.StubApp;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cms.Attribute;
import org.bouncycastle.asn1.cms.AttributeTable;
import org.bouncycastle.asn1.cms.CMSAlgorithmProtection;
import org.bouncycastle.asn1.cms.CMSAttributes;
import org.bouncycastle.asn1.cms.Time;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DefaultSignedAttributeTableGenerator implements CMSAttributeTableGenerator {
    private final Hashtable table;

    public DefaultSignedAttributeTableGenerator() {
        this.table = new Hashtable();
    }

    private static Hashtable copyHashTable(Hashtable hashtable) {
        Hashtable hashtable2 = new Hashtable();
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            hashtable2.put(nextElement, hashtable.get(nextElement));
        }
        return hashtable2;
    }

    public Hashtable createStandardAttributeTable(Map map) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        Hashtable copyHashTable = copyHashTable(this.table);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = CMSAttributes.contentType;
        if (!copyHashTable.containsKey(aSN1ObjectIdentifier2) && (aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(map.get(StubApp.getString2(677)))) != null) {
            Attribute attribute = new Attribute(aSN1ObjectIdentifier2, new DERSet(aSN1ObjectIdentifier));
            copyHashTable.put(attribute.getAttrType(), attribute);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = CMSAttributes.signingTime;
        if (!copyHashTable.containsKey(aSN1ObjectIdentifier3)) {
            Attribute attribute2 = new Attribute(aSN1ObjectIdentifier3, new DERSet(new Time(new Date())));
            copyHashTable.put(attribute2.getAttrType(), attribute2);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = CMSAttributes.messageDigest;
        if (!copyHashTable.containsKey(aSN1ObjectIdentifier4)) {
            Attribute attribute3 = new Attribute(aSN1ObjectIdentifier4, new DERSet(new DEROctetString((byte[]) map.get(StubApp.getString2(13292)))));
            copyHashTable.put(attribute3.getAttrType(), attribute3);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSAttributes.cmsAlgorithmProtect;
        if (!copyHashTable.contains(aSN1ObjectIdentifier5)) {
            Attribute attribute4 = new Attribute(aSN1ObjectIdentifier5, new DERSet(new CMSAlgorithmProtection((AlgorithmIdentifier) map.get(StubApp.getString2(28142)), 1, (AlgorithmIdentifier) map.get(StubApp.getString2(28204)))));
            copyHashTable.put(attribute4.getAttrType(), attribute4);
        }
        return copyHashTable;
    }

    @Override // org.bouncycastle.cms.CMSAttributeTableGenerator
    public AttributeTable getAttributes(Map map) {
        return new AttributeTable(createStandardAttributeTable(map));
    }

    public DefaultSignedAttributeTableGenerator(AttributeTable attributeTable) {
        this.table = attributeTable != null ? attributeTable.toHashtable() : new Hashtable();
    }
}
