package com.mapbox.bindgen;

import com.stub.StubApp;
import i2.u;
import java.util.ArrayList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class ObjectReferences {
    private Object mainReference;
    private ArrayList<Object> additionalReferences = null;
    private int referenceCount = 1;

    public ObjectReferences(Object obj) {
        this.mainReference = obj;
    }

    private void deleteAdditionalReference(int i3) {
        int i10 = i3 - 1;
        ArrayList<Object> arrayList = this.additionalReferences;
        if (arrayList == null || i10 >= arrayList.size()) {
            throw new IndexOutOfBoundsException(u.p(i10, StubApp.getString2(13182)));
        }
        if (this.additionalReferences.get(i10) != null) {
            this.referenceCount--;
            this.additionalReferences.set(i10, null);
        }
    }

    private void deleteMainReference() {
        if (this.mainReference != null) {
            this.referenceCount--;
            this.mainReference = null;
        }
    }

    public int addAdditional(Object obj) {
        this.referenceCount++;
        if (this.additionalReferences == null) {
            this.additionalReferences = new ArrayList<>(3);
        }
        this.additionalReferences.add(obj);
        return this.additionalReferences.size();
    }

    public void delete(int i3) {
        if (i3 == 0) {
            deleteMainReference();
        } else if (i3 > 0) {
            deleteAdditionalReference(i3);
        }
    }

    public Object get(int i3) {
        if (i3 == 0) {
            return this.mainReference;
        }
        if (i3 < 0) {
            return null;
        }
        int i10 = i3 - 1;
        ArrayList<Object> arrayList = this.additionalReferences;
        if (arrayList == null || i10 >= arrayList.size()) {
            throw new IndexOutOfBoundsException(u.p(i10, StubApp.getString2(13183)));
        }
        return this.additionalReferences.get(i10);
    }

    public int getReferenceCount() {
        return this.referenceCount;
    }
}
