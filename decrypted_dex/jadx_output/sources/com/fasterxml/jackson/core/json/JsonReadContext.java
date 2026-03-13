package com.fasterxml.jackson.core.json;

import E1.a;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.io.ContentReference;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class JsonReadContext extends JsonStreamContext {
    protected JsonReadContext _child;
    protected int _columnNr;
    protected String _currentName;
    protected Object _currentValue;
    protected DupDetector _dups;
    protected int _lineNr;
    protected final JsonReadContext _parent;

    public JsonReadContext(JsonReadContext jsonReadContext, DupDetector dupDetector, int i3, int i10, int i11) {
        this._parent = jsonReadContext;
        this._dups = dupDetector;
        this._type = i3;
        this._lineNr = i10;
        this._columnNr = i11;
        this._index = -1;
    }

    private void _checkDup(DupDetector dupDetector, String str) throws JsonProcessingException {
        if (dupDetector.isDup(str)) {
            Object source = dupDetector.getSource();
            throw new JsonParseException(source instanceof JsonParser ? (JsonParser) source : null, a.k(StubApp.getString2(10413), str, StubApp.getString2(620)));
        }
    }

    public static JsonReadContext createRootContext(DupDetector dupDetector) {
        return new JsonReadContext(null, dupDetector, 0, 1, 0);
    }

    public JsonReadContext clearAndGetParent() {
        this._currentValue = null;
        return this._parent;
    }

    public JsonReadContext createChildArrayContext(int i3, int i10) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext != null) {
            jsonReadContext.reset(1, i3, i10);
            return jsonReadContext;
        }
        DupDetector dupDetector = this._dups;
        JsonReadContext jsonReadContext2 = new JsonReadContext(this, dupDetector == null ? null : dupDetector.child(), 1, i3, i10);
        this._child = jsonReadContext2;
        return jsonReadContext2;
    }

    public JsonReadContext createChildObjectContext(int i3, int i10) {
        JsonReadContext jsonReadContext = this._child;
        if (jsonReadContext != null) {
            jsonReadContext.reset(2, i3, i10);
            return jsonReadContext;
        }
        DupDetector dupDetector = this._dups;
        JsonReadContext jsonReadContext2 = new JsonReadContext(this, dupDetector == null ? null : dupDetector.child(), 2, i3, i10);
        this._child = jsonReadContext2;
        return jsonReadContext2;
    }

    public boolean expectComma() {
        int i3 = this._index + 1;
        this._index = i3;
        return this._type != 0 && i3 > 0;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public String getCurrentName() {
        return this._currentName;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public Object getCurrentValue() {
        return this._currentValue;
    }

    public DupDetector getDupDetector() {
        return this._dups;
    }

    public void reset(int i3, int i10, int i11) {
        this._type = i3;
        this._index = -1;
        this._lineNr = i10;
        this._columnNr = i11;
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
        return new JsonLocation(contentReference, -1L, this._lineNr, this._columnNr);
    }

    public JsonReadContext withDupDetector(DupDetector dupDetector) {
        this._dups = dupDetector;
        return this;
    }

    @Override // com.fasterxml.jackson.core.JsonStreamContext
    public JsonReadContext getParent() {
        return this._parent;
    }
}
