package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BeanPropertyMap implements Iterable<SettableBeanProperty>, Serializable {
    private final Map<String, List<PropertyName>> _aliasDefs;
    private final Map<String, String> _aliasMapping;
    protected final boolean _caseInsensitive;
    private Object[] _hashArea;
    private int _hashMask;
    private final Locale _locale;
    private final SettableBeanProperty[] _propsInOrder;
    private int _size;
    private int _spillCount;

    public BeanPropertyMap(boolean z2, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, Locale locale) {
        this._caseInsensitive = z2;
        this._propsInOrder = (SettableBeanProperty[]) collection.toArray(new SettableBeanProperty[collection.size()]);
        this._aliasDefs = map;
        this._locale = locale;
        this._aliasMapping = _buildAliasMapping(map, z2, locale);
        init(collection);
    }

    private Map<String, String> _buildAliasMapping(Map<String, List<PropertyName>> map, boolean z2, Locale locale) {
        if (map == null || map.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<PropertyName>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (z2) {
                key = key.toLowerCase(locale);
            }
            Iterator<PropertyName> it = entry.getValue().iterator();
            while (it.hasNext()) {
                String simpleName = it.next().getSimpleName();
                if (z2) {
                    simpleName = simpleName.toLowerCase(locale);
                }
                hashMap.put(simpleName, key);
            }
        }
        return hashMap;
    }

    private final SettableBeanProperty _find2(String str, int i3, Object obj) {
        if (obj == null) {
            return _findWithAlias(this._aliasMapping.get(str));
        }
        int i10 = this._hashMask + 1;
        int i11 = ((i3 >> 1) + i10) << 1;
        Object obj2 = this._hashArea[i11];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i11 + 1];
        }
        if (obj2 != null) {
            int i12 = (i10 + (i10 >> 1)) << 1;
            int i13 = this._spillCount + i12;
            while (i12 < i13) {
                Object obj3 = this._hashArea[i12];
                if (obj3 == str || str.equals(obj3)) {
                    return (SettableBeanProperty) this._hashArea[i12 + 1];
                }
                i12 += 2;
            }
        }
        return _findWithAlias(this._aliasMapping.get(str));
    }

    private SettableBeanProperty _find2ViaAlias(String str, int i3, Object obj) {
        int i10 = this._hashMask + 1;
        int i11 = ((i3 >> 1) + i10) << 1;
        Object obj2 = this._hashArea[i11];
        if (str.equals(obj2)) {
            return (SettableBeanProperty) this._hashArea[i11 + 1];
        }
        if (obj2 == null) {
            return null;
        }
        int i12 = (i10 + (i10 >> 1)) << 1;
        int i13 = this._spillCount + i12;
        while (i12 < i13) {
            Object obj3 = this._hashArea[i12];
            if (obj3 == str || str.equals(obj3)) {
                return (SettableBeanProperty) this._hashArea[i12 + 1];
            }
            i12 += 2;
        }
        return null;
    }

    private final int _findFromOrdered(SettableBeanProperty settableBeanProperty) {
        int length = this._propsInOrder.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this._propsInOrder[i3] == settableBeanProperty) {
                return i3;
            }
        }
        throw new IllegalStateException("Illegal state: property '" + settableBeanProperty.getName() + "' missing from _propsInOrder");
    }

    private SettableBeanProperty _findWithAlias(String str) {
        if (str == null) {
            return null;
        }
        int _hashCode = _hashCode(str);
        int i3 = _hashCode << 1;
        Object obj = this._hashArea[i3];
        if (str.equals(obj)) {
            return (SettableBeanProperty) this._hashArea[i3 + 1];
        }
        if (obj == null) {
            return null;
        }
        return _find2ViaAlias(str, _hashCode, obj);
    }

    private final int _hashCode(String str) {
        return str.hashCode() & this._hashMask;
    }

    private List<SettableBeanProperty> _properties() {
        ArrayList arrayList = new ArrayList(this._size);
        int length = this._hashArea.length;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty != null) {
                arrayList.add(settableBeanProperty);
            }
        }
        return arrayList;
    }

    public static BeanPropertyMap construct(MapperConfig<?> mapperConfig, Collection<SettableBeanProperty> collection, Map<String, List<PropertyName>> map, boolean z2) {
        return new BeanPropertyMap(z2, collection, map, mapperConfig.getLocale());
    }

    private static final int findSize(int i3) {
        if (i3 <= 5) {
            return 8;
        }
        if (i3 <= 12) {
            return 16;
        }
        int i10 = 32;
        while (i10 < i3 + (i3 >> 2)) {
            i10 += i10;
        }
        return i10;
    }

    public SettableBeanProperty _rename(SettableBeanProperty settableBeanProperty, NameTransformer nameTransformer) {
        JsonDeserializer<Object> unwrappingDeserializer;
        if (settableBeanProperty == null) {
            return settableBeanProperty;
        }
        SettableBeanProperty withSimpleName = settableBeanProperty.withSimpleName(nameTransformer.transform(settableBeanProperty.getName()));
        JsonDeserializer<Object> valueDeserializer = withSimpleName.getValueDeserializer();
        return (valueDeserializer == null || (unwrappingDeserializer = valueDeserializer.unwrappingDeserializer(nameTransformer)) == valueDeserializer) ? withSimpleName : withSimpleName.withValueDeserializer(unwrappingDeserializer);
    }

    public BeanPropertyMap assignIndexes() {
        int length = this._hashArea.length;
        int i3 = 0;
        for (int i10 = 1; i10 < length; i10 += 2) {
            SettableBeanProperty settableBeanProperty = (SettableBeanProperty) this._hashArea[i10];
            if (settableBeanProperty != null) {
                settableBeanProperty.assignIndex(i3);
                i3++;
            }
        }
        return this;
    }

    public SettableBeanProperty find(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot pass null property name");
        }
        if (this._caseInsensitive) {
            str = str.toLowerCase(this._locale);
        }
        int hashCode = str.hashCode() & this._hashMask;
        int i3 = hashCode << 1;
        Object obj = this._hashArea[i3];
        return (obj == str || str.equals(obj)) ? (SettableBeanProperty) this._hashArea[i3 + 1] : _find2(str, hashCode, obj);
    }

    public SettableBeanProperty[] getPropertiesInInsertionOrder() {
        return this._propsInOrder;
    }

    public final String getPropertyName(SettableBeanProperty settableBeanProperty) {
        boolean z2 = this._caseInsensitive;
        String name = settableBeanProperty.getName();
        return z2 ? name.toLowerCase(this._locale) : name;
    }

    public void init(Collection<SettableBeanProperty> collection) {
        int size = collection.size();
        this._size = size;
        int findSize = findSize(size);
        this._hashMask = findSize - 1;
        int i3 = (findSize >> 1) + findSize;
        Object[] objArr = new Object[i3 * 2];
        int i10 = 0;
        for (SettableBeanProperty settableBeanProperty : collection) {
            if (settableBeanProperty != null) {
                String propertyName = getPropertyName(settableBeanProperty);
                int _hashCode = _hashCode(propertyName);
                int i11 = _hashCode << 1;
                if (objArr[i11] != null) {
                    i11 = ((_hashCode >> 1) + findSize) << 1;
                    if (objArr[i11] != null) {
                        i11 = (i3 << 1) + i10;
                        i10 += 2;
                        if (i11 >= objArr.length) {
                            objArr = Arrays.copyOf(objArr, objArr.length + 4);
                        }
                    }
                }
                objArr[i11] = propertyName;
                objArr[i11 + 1] = settableBeanProperty;
            }
        }
        this._hashArea = objArr;
        this._spillCount = i10;
    }

    public boolean isCaseInsensitive() {
        return this._caseInsensitive;
    }

    @Override // java.lang.Iterable
    public Iterator<SettableBeanProperty> iterator() {
        return _properties().iterator();
    }

    public void remove(SettableBeanProperty settableBeanProperty) {
        ArrayList arrayList = new ArrayList(this._size);
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        boolean z2 = false;
        for (int i3 = 1; i3 < length; i3 += 2) {
            Object[] objArr = this._hashArea;
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) objArr[i3];
            if (settableBeanProperty2 != null) {
                if (z2 || !(z2 = propertyName.equals(objArr[i3 - 1]))) {
                    arrayList.add(settableBeanProperty2);
                } else {
                    this._propsInOrder[_findFromOrdered(settableBeanProperty2)] = null;
                }
            }
        }
        if (z2) {
            init(arrayList);
            return;
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't remove");
    }

    public BeanPropertyMap renameAll(NameTransformer nameTransformer) {
        if (nameTransformer == null || nameTransformer == NameTransformer.NOP) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i3];
            if (settableBeanProperty == null) {
                arrayList.add(settableBeanProperty);
            } else {
                arrayList.add(_rename(settableBeanProperty, nameTransformer));
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs, this._locale);
    }

    public void replace(SettableBeanProperty settableBeanProperty, SettableBeanProperty settableBeanProperty2) {
        int length = this._hashArea.length;
        for (int i3 = 1; i3 < length; i3 += 2) {
            Object[] objArr = this._hashArea;
            if (objArr[i3] == settableBeanProperty) {
                objArr[i3] = settableBeanProperty2;
                this._propsInOrder[_findFromOrdered(settableBeanProperty)] = settableBeanProperty2;
                return;
            }
        }
        throw new NoSuchElementException("No entry '" + settableBeanProperty.getName() + "' found, can't replace");
    }

    public int size() {
        return this._size;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Properties=[");
        Iterator<SettableBeanProperty> it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            SettableBeanProperty next = it.next();
            int i10 = i3 + 1;
            if (i3 > 0) {
                sb2.append(", ");
            }
            sb2.append(next.getName());
            sb2.append('(');
            sb2.append(next.getType());
            sb2.append(')');
            i3 = i10;
        }
        sb2.append(']');
        if (!this._aliasDefs.isEmpty()) {
            sb2.append("(aliases: ");
            sb2.append(this._aliasDefs);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public BeanPropertyMap withCaseInsensitivity(boolean z2) {
        return this._caseInsensitive == z2 ? this : new BeanPropertyMap(this, z2);
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settableBeanProperty) {
        String propertyName = getPropertyName(settableBeanProperty);
        int length = this._hashArea.length;
        for (int i3 = 1; i3 < length; i3 += 2) {
            SettableBeanProperty settableBeanProperty2 = (SettableBeanProperty) this._hashArea[i3];
            if (settableBeanProperty2 != null && settableBeanProperty2.getName().equals(propertyName)) {
                return new BeanPropertyMap(this, settableBeanProperty, i3, _findFromOrdered(settableBeanProperty2));
            }
        }
        return new BeanPropertyMap(this, settableBeanProperty, propertyName, _hashCode(propertyName));
    }

    public BeanPropertyMap withoutProperties(Collection<String> collection, Collection<String> collection2) {
        if ((collection == null || collection.isEmpty()) && collection2 == null) {
            return this;
        }
        int length = this._propsInOrder.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i3 = 0; i3 < length; i3++) {
            SettableBeanProperty settableBeanProperty = this._propsInOrder[i3];
            if (settableBeanProperty != null && !IgnorePropertiesUtil.shouldIgnore(settableBeanProperty.getName(), collection, collection2)) {
                arrayList.add(settableBeanProperty);
            }
        }
        return new BeanPropertyMap(this._caseInsensitive, arrayList, this._aliasDefs, this._locale);
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, int i3, int i10) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        this._hashArea[i3] = settableBeanProperty;
        settableBeanPropertyArr2[i10] = settableBeanProperty;
    }

    private BeanPropertyMap(BeanPropertyMap beanPropertyMap, SettableBeanProperty settableBeanProperty, String str, int i3) {
        this._caseInsensitive = beanPropertyMap._caseInsensitive;
        this._locale = beanPropertyMap._locale;
        this._hashMask = beanPropertyMap._hashMask;
        this._size = beanPropertyMap._size;
        this._spillCount = beanPropertyMap._spillCount;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        Object[] objArr = beanPropertyMap._hashArea;
        this._hashArea = Arrays.copyOf(objArr, objArr.length);
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        int length = settableBeanPropertyArr.length;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, length + 1);
        this._propsInOrder = settableBeanPropertyArr2;
        settableBeanPropertyArr2[length] = settableBeanProperty;
        int i10 = this._hashMask + 1;
        int i11 = i3 << 1;
        Object[] objArr2 = this._hashArea;
        if (objArr2[i11] != null) {
            i11 = ((i3 >> 1) + i10) << 1;
            if (objArr2[i11] != null) {
                int i12 = this._spillCount;
                i11 = ((i10 + (i10 >> 1)) << 1) + i12;
                this._spillCount = i12 + 2;
                if (i11 >= objArr2.length) {
                    this._hashArea = Arrays.copyOf(objArr2, objArr2.length + 4);
                }
            }
        }
        Object[] objArr3 = this._hashArea;
        objArr3[i11] = str;
        objArr3[i11 + 1] = settableBeanProperty;
    }

    public BeanPropertyMap(BeanPropertyMap beanPropertyMap, boolean z2) {
        this._caseInsensitive = z2;
        this._locale = beanPropertyMap._locale;
        this._aliasDefs = beanPropertyMap._aliasDefs;
        this._aliasMapping = beanPropertyMap._aliasMapping;
        SettableBeanProperty[] settableBeanPropertyArr = beanPropertyMap._propsInOrder;
        SettableBeanProperty[] settableBeanPropertyArr2 = (SettableBeanProperty[]) Arrays.copyOf(settableBeanPropertyArr, settableBeanPropertyArr.length);
        this._propsInOrder = settableBeanPropertyArr2;
        init(Arrays.asList(settableBeanPropertyArr2));
    }
}
