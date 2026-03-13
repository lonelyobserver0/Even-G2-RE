package com.fasterxml.jackson.dataformat.cbor;

import E1.a;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.json.DupDetector;
import com.stub.StubApp;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class CBORReadContext extends JsonStreamContext {
    protected CBORReadContext _child = null;
    protected String _currentName;
    protected Object _currentValue;
    protected final DupDetector _dups;
    protected int _expEntryCount;
    protected final CBORReadContext _parent;

    public CBORReadContext(CBORReadContext cBORReadContext, DupDetector dupDetector, int i3, int i10) {
        this._parent = cBORReadContext;
        this._dups = dupDetector;
        this._type = i3;
        this._expEntryCount = i10;
        this._index = -1;
    }

    private void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        if (dupDetector.isDup(str)) {
            throw new JsonParseException((JsonParser) null, a.k(StubApp.getString2(10413), str, StubApp.getString2(620)), dupDetector.findLocation());
        }
    }

    public static CBORReadContext createRootContext(DupDetector dupDetector) {
        return new CBORReadContext(null, dupDetector, 0, -1);
    }

    public CBORReadContext createChildArrayContext(int i3) {
        CBORReadContext cBORReadContext = this._child;
        if (cBORReadContext != null) {
            cBORReadContext.reset(1, i3);
            return cBORReadContext;
        }
        DupDetector dupDetector = this._dups;
        CBORReadContext cBORReadContext2 = new CBORReadContext(this, dupDetector == null ? null : dupDetector.child(), 1, i3);
        this._child = cBORReadContext2;
        return cBORReadContext2;
    }

    public CBORReadContext createChildObjectContext(int i3) {
        CBORReadContext cBORReadContext = this._child;
        if (cBORReadContext != null) {
            cBORReadContext.reset(2, i3);
            return cBORReadContext;
        }
        DupDetector dupDetector = this._dups;
        CBORReadContext cBORReadContext2 = new CBORReadContext(this, dupDetector == null ? null : dupDetector.child(), 2, i3);
        this._child = cBORReadContext2;
        return cBORReadContext2;
    }

    public boolean expectMoreValues() {
        int i3 = this._index + 1;
        this._index = i3;
        return i3 != this._expEntryCount;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    public int getExpectedLength() {
        return this._expEntryCount;
    }

    public int getRemainingExpectedLength() {
        return Math.max(0, this._expEntryCount - this._index);
    }

    public boolean hasExpectedLength() {
        return this._expEntryCount >= 0;
    }

    public void reset(int i3, int i10) {
        this._type = i3;
        this._expEntryCount = i10;
        this._index = -1;
        this._currentName = null;
        this._currentValue = null;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            dupDetector.reset();
        }
    }

    public void setCurrentName(String str) throws JsonProcessingException {
        this._currentName = str;
        DupDetector dupDetector = this._dups;
        if (dupDetector != null) {
            _checkDup(dupDetector, str);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public void setCurrentValue(Object obj) {
        this._currentValue = obj;
    }

    public JsonLocation startLocation(ContentReference contentReference) {
        return new JsonLocation(contentReference, 1L, -1, -1);
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i3 = this._type;
        if (i3 == 0) {
            sb2.append(StubApp.getString2(601));
        } else if (i3 == 1) {
            sb2.append('[');
            sb2.append(getCurrentIndex());
            sb2.append(']');
        } else if (i3 == 2) {
            sb2.append('{');
            if (this._currentName != null) {
                sb2.append(Typography.quote);
                CharTypes.appendQuoted(sb2, this._currentName);
                sb2.append(Typography.quote);
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        }
        return sb2.toString();
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public CBORReadContext getParent() {
        return this._parent;
    }
}
