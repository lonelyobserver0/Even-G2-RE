package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.stub.StubApp;
import java.util.Collection;
import java.util.Iterator;
import kotlin.text.Typography;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    protected transient String _propertiesAsString;
    protected final Collection<Object> _propertyIds;
    protected final String _propertyName;
    protected final Class<?> _referringClass;

    public PropertyBindingException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Class<?> cls, String str2, Collection<Object> collection) {
        super(jsonParser, str, jsonLocation);
        this._referringClass = cls;
        this._propertyName = str2;
        this._propertyIds = collection;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public String getMessageSuffix() {
        String str = this._propertiesAsString;
        if (str != null || this._propertyIds == null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder(100);
        int size = this._propertyIds.size();
        if (size != 1) {
            sb2.append(StubApp.getString2(1561));
            sb2.append(size);
            sb2.append(StubApp.getString2(10775));
            Iterator<Object> it = this._propertyIds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(Typography.quote);
                sb2.append(String.valueOf(it.next()));
                sb2.append(Typography.quote);
                if (sb2.length() > 1000) {
                    sb2.append(StubApp.getString2(10776));
                    break;
                }
                if (it.hasNext()) {
                    sb2.append(StubApp.getString2(81));
                }
            }
        } else {
            sb2.append(StubApp.getString2(10774));
            sb2.append(String.valueOf(this._propertyIds.iterator().next()));
            sb2.append(Typography.quote);
        }
        sb2.append(StubApp.getString2(6691));
        String sb3 = sb2.toString();
        this._propertiesAsString = sb3;
        return sb3;
    }
}
