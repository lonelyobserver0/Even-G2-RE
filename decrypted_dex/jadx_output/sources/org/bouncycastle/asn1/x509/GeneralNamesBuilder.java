package org.bouncycastle.asn1.x509;

import java.util.Vector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GeneralNamesBuilder {
    private Vector names = new Vector();

    public GeneralNamesBuilder addName(GeneralName generalName) {
        this.names.addElement(generalName);
        return this;
    }

    public GeneralNamesBuilder addNames(GeneralNames generalNames) {
        GeneralName[] names = generalNames.getNames();
        for (int i3 = 0; i3 != names.length; i3++) {
            this.names.addElement(names[i3]);
        }
        return this;
    }

    public GeneralNames build() {
        int size = this.names.size();
        GeneralName[] generalNameArr = new GeneralName[size];
        for (int i3 = 0; i3 != size; i3++) {
            generalNameArr[i3] = (GeneralName) this.names.elementAt(i3);
        }
        return new GeneralNames(generalNameArr);
    }
}
