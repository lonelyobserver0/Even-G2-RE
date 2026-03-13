package org.bouncycastle.voms;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.IetfAttrSyntax;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class VOMSAttribute {
    public static final String VOMS_ATTR_OID = StubApp.getString2(35031);
    private X509AttributeCertificateHolder myAC;
    private List myFQANs;
    private String myHostPort;
    private List myStringList;
    private String myVo;

    public static class FQAN {
        String capability;
        String fqan;
        String group;
        String role;

        public FQAN(String str) {
            this.fqan = str;
        }

        public String getCapability() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.capability;
        }

        public String getFQAN() {
            String str = this.fqan;
            if (str != null) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.group);
            sb2.append(StubApp.getString2(35029));
            String str2 = this.role;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            if (this.capability != null) {
                str3 = StubApp.getString2(35030) + this.capability;
            }
            sb2.append(str3);
            String sb3 = sb2.toString();
            this.fqan = sb3;
            return sb3;
        }

        public String getGroup() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.group;
        }

        public String getRole() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.role;
        }

        public void split() {
            this.fqan.getClass();
            int indexOf = this.fqan.indexOf(StubApp.getString2(35029));
            if (indexOf < 0) {
                return;
            }
            this.group = this.fqan.substring(0, indexOf);
            int i3 = indexOf + 6;
            int indexOf2 = this.fqan.indexOf(StubApp.getString2(35030), i3);
            String str = this.fqan;
            String substring = indexOf2 < 0 ? str.substring(i3) : str.substring(i3, indexOf2);
            String str2 = null;
            if (substring.length() == 0) {
                substring = null;
            }
            this.role = substring;
            String substring2 = indexOf2 < 0 ? null : this.fqan.substring(indexOf2 + 12);
            if (substring2 != null && substring2.length() != 0) {
                str2 = substring2;
            }
            this.capability = str2;
        }

        public String toString() {
            return getFQAN();
        }

        public FQAN(String str, String str2, String str3) {
            this.group = str;
            this.role = str2;
            this.capability = str3;
        }
    }

    public VOMSAttribute(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        String string2 = StubApp.getString2(601);
        this.myStringList = new ArrayList();
        this.myFQANs = new ArrayList();
        if (x509AttributeCertificateHolder == null) {
            throw new IllegalArgumentException(StubApp.getString2(35035));
        }
        this.myAC = x509AttributeCertificateHolder;
        Attribute[] attributes = x509AttributeCertificateHolder.getAttributes(new ASN1ObjectIdentifier(StubApp.getString2(35031)));
        if (attributes == null) {
            return;
        }
        for (int i3 = 0; i3 != attributes.length; i3++) {
            try {
                IetfAttrSyntax ietfAttrSyntax = IetfAttrSyntax.getInstance(attributes[i3].getAttributeValues()[0]);
                String string = ((ASN1IA5String) ietfAttrSyntax.getPolicyAuthority().getNames()[0].getName()).getString();
                int indexOf = string.indexOf(StubApp.getString2("13138"));
                if (indexOf < 0 || indexOf == string.length() - 1) {
                    throw new IllegalArgumentException(StubApp.getString2("35033") + string + StubApp.getString2("511"));
                }
                this.myVo = string.substring(0, indexOf);
                this.myHostPort = string.substring(indexOf + 3);
                if (ietfAttrSyntax.getValueType() != 1) {
                    throw new IllegalArgumentException(StubApp.getString2("35032") + string);
                }
                ASN1OctetString[] aSN1OctetStringArr = (ASN1OctetString[]) ietfAttrSyntax.getValues();
                for (int i10 = 0; i10 != aSN1OctetStringArr.length; i10++) {
                    String str = new String(aSN1OctetStringArr[i10].getOctets());
                    FQAN fqan = new FQAN(str);
                    if (!this.myStringList.contains(str)) {
                        if (str.startsWith(string2 + this.myVo + string2)) {
                            this.myStringList.add(str);
                            this.myFQANs.add(fqan);
                        }
                    }
                }
            } catch (IllegalArgumentException e10) {
                throw e10;
            } catch (Exception unused) {
                throw new IllegalArgumentException(StubApp.getString2(35034) + x509AttributeCertificateHolder.getIssuer());
            }
        }
    }

    public X509AttributeCertificateHolder getAC() {
        return this.myAC;
    }

    public List getFullyQualifiedAttributes() {
        return this.myStringList;
    }

    public String getHostPort() {
        return this.myHostPort;
    }

    public List getListOfFQAN() {
        return this.myFQANs;
    }

    public String getVO() {
        return this.myVo;
    }

    public String toString() {
        return StubApp.getString2(35036) + this.myVo + StubApp.getString2(35037) + this.myHostPort + StubApp.getString2(35038) + this.myFQANs;
    }
}
