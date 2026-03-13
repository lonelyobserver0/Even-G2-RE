package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharTypes;
import com.stub.StubApp;
import kotlin.text.Typography;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JsonStreamContext {
    protected int _index;
    protected int _type;

    public JsonStreamContext() {
    }

    public final int getCurrentIndex() {
        int i3 = this._index;
        if (i3 < 0) {
            return 0;
        }
        return i3;
    }

    public abstract String getCurrentName();

    public abstract Object getCurrentValue();

    public final int getEntryCount() {
        return this._index + 1;
    }

    public abstract JsonStreamContext getParent();

    public final boolean inArray() {
        return this._type == 1;
    }

    public final boolean inObject() {
        return this._type == 2;
    }

    public final boolean inRoot() {
        return this._type == 0;
    }

    public abstract void setCurrentValue(Object obj);

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i3 = this._type;
        if (i3 == 0) {
            sb2.append(StubApp.getString2(601));
        } else if (i3 != 1) {
            sb2.append('{');
            String currentName = getCurrentName();
            if (currentName != null) {
                sb2.append(Typography.quote);
                CharTypes.appendQuoted(sb2, currentName);
                sb2.append(Typography.quote);
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        }
        return sb2.toString();
    }

    public String typeDesc() {
        int i3 = this._type;
        return i3 != 0 ? i3 != 1 ? i3 != 2 ? StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes) : StubApp.getString2(10291) : StubApp.getString2(10292) : StubApp.getString2(10293);
    }

    public JsonStreamContext(JsonStreamContext jsonStreamContext) {
        this._type = jsonStreamContext._type;
        this._index = jsonStreamContext._index;
    }

    public JsonStreamContext(int i3, int i10) {
        this._type = i3;
        this._index = i10;
    }
}
