package com.fasterxml.jackson.databind.introspect;

import Xa.h;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class POJOPropertiesCollector {
    protected final AccessorNamingStrategy _accessorNaming;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected LinkedList<AnnotatedMember> _anyGetterField;
    protected LinkedList<AnnotatedMember> _anyGetters;
    protected LinkedList<AnnotatedMember> _anySetterField;
    protected LinkedList<AnnotatedMethod> _anySetters;
    protected final AnnotatedClass _classDef;
    protected boolean _collected;
    protected final MapperConfig<?> _config;
    protected LinkedList<POJOPropertyBuilder> _creatorProperties;
    protected Map<PropertyName, PropertyName> _fieldRenameMappings;
    protected final boolean _forSerialization;
    protected HashSet<String> _ignoredPropertyNames;
    protected LinkedHashMap<Object, AnnotatedMember> _injectables;
    protected LinkedList<AnnotatedMember> _jsonKeyAccessors;
    protected LinkedList<AnnotatedMember> _jsonValueAccessors;

    @Deprecated
    protected String _mutatorPrefix = StubApp.getString2(6911);
    protected LinkedHashMap<String, POJOPropertyBuilder> _properties;

    @Deprecated
    protected final boolean _stdBeanNaming;
    protected final JavaType _type;
    protected final boolean _useAnnotations;
    protected final VisibilityChecker<?> _visibilityChecker;

    public POJOPropertiesCollector(MapperConfig<?> mapperConfig, boolean z2, JavaType javaType, AnnotatedClass annotatedClass, AccessorNamingStrategy accessorNamingStrategy) {
        this._config = mapperConfig;
        this._forSerialization = z2;
        this._type = javaType;
        this._classDef = annotatedClass;
        if (mapperConfig.isAnnotationProcessingEnabled()) {
            this._useAnnotations = true;
            this._annotationIntrospector = mapperConfig.getAnnotationIntrospector();
        } else {
            this._useAnnotations = false;
            this._annotationIntrospector = AnnotationIntrospector.nopInstance();
        }
        this._visibilityChecker = mapperConfig.getDefaultVisibilityChecker(javaType.getRawClass(), annotatedClass);
        this._accessorNaming = accessorNamingStrategy;
        this._stdBeanNaming = mapperConfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
    }

    private boolean _anyIndexed(Collection<POJOPropertyBuilder> collection) {
        Iterator<POJOPropertyBuilder> it = collection.iterator();
        while (it.hasNext()) {
            if (it.next().getMetadata().hasIndex()) {
                return true;
            }
        }
        return false;
    }

    private String _checkRenameByField(String str) {
        PropertyName propertyName;
        Map<PropertyName, PropertyName> map = this._fieldRenameMappings;
        return (map == null || (propertyName = map.get(_propNameFromSimple(str))) == null) ? str : propertyName.getSimpleName();
    }

    private PropertyNamingStrategy _findNamingStrategy() {
        Object findNamingStrategy = this._annotationIntrospector.findNamingStrategy(this._classDef);
        if (findNamingStrategy == null) {
            this._config.getPropertyNamingStrategy();
            return null;
        }
        if (!(findNamingStrategy instanceof Class)) {
            throw new IllegalStateException(StubApp.getString2(10816) + findNamingStrategy.getClass().getName() + StubApp.getString2(10817));
        }
        Class cls = (Class) findNamingStrategy;
        if (cls != PropertyNamingStrategy.class) {
            if (!PropertyNamingStrategy.class.isAssignableFrom(cls)) {
                throw new IllegalStateException(h.k(cls, new StringBuilder(StubApp.getString2(10505)), StubApp.getString2(10815)));
            }
            this._config.getHandlerInstantiator();
            if (ClassUtil.createInstance(cls, this._config.canOverrideAccessModifiers()) != null) {
                throw new ClassCastException();
            }
        }
        return null;
    }

    private PropertyName _propNameFromSimple(String str) {
        return PropertyName.construct(str, null);
    }

    public void _addCreatorParam(Map<String, POJOPropertyBuilder> map, AnnotatedParameter annotatedParameter) {
        JsonCreator.Mode findCreatorAnnotation;
        String findImplicitPropertyName = this._annotationIntrospector.findImplicitPropertyName(annotatedParameter);
        if (findImplicitPropertyName == null) {
            findImplicitPropertyName = "";
        }
        PropertyName findNameForDeserialization = this._annotationIntrospector.findNameForDeserialization(annotatedParameter);
        boolean z2 = (findNameForDeserialization == null || findNameForDeserialization.isEmpty()) ? false : true;
        if (!z2) {
            if (findImplicitPropertyName.isEmpty() || (findCreatorAnnotation = this._annotationIntrospector.findCreatorAnnotation(this._config, annotatedParameter.getOwner())) == null || findCreatorAnnotation == JsonCreator.Mode.DISABLED) {
                return;
            } else {
                findNameForDeserialization = PropertyName.construct(findImplicitPropertyName);
            }
        }
        PropertyName propertyName = findNameForDeserialization;
        String _checkRenameByField = _checkRenameByField(findImplicitPropertyName);
        POJOPropertyBuilder _property = (z2 && _checkRenameByField.isEmpty()) ? _property(map, propertyName) : _property(map, _checkRenameByField);
        _property.addCtor(annotatedParameter, propertyName, z2, true, false);
        this._creatorProperties.add(_property);
    }

    public void _addCreators(Map<String, POJOPropertyBuilder> map) {
        if (this._useAnnotations) {
            Iterator<AnnotatedConstructor> it = this._classDef.getConstructors().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnnotatedConstructor next = it.next();
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount = next.getParameterCount();
                for (int i3 = 0; i3 < parameterCount; i3++) {
                    _addCreatorParam(map, next.getParameter(i3));
                }
            }
            for (AnnotatedMethod annotatedMethod : this._classDef.getFactoryMethods()) {
                if (this._creatorProperties == null) {
                    this._creatorProperties = new LinkedList<>();
                }
                int parameterCount2 = annotatedMethod.getParameterCount();
                for (int i10 = 0; i10 < parameterCount2; i10++) {
                    _addCreatorParam(map, annotatedMethod.getParameter(i10));
                }
            }
        }
    }

    public void _addFields(Map<String, POJOPropertyBuilder> map) {
        boolean z2;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        boolean z10 = (this._forSerialization || this._config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS)) ? false : true;
        boolean isEnabled = this._config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
        for (AnnotatedField annotatedField : this._classDef.fields()) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(annotationIntrospector.hasAsKey(this._config, annotatedField))) {
                if (this._jsonKeyAccessors == null) {
                    this._jsonKeyAccessors = new LinkedList<>();
                }
                this._jsonKeyAccessors.add(annotatedField);
            }
            if (bool.equals(annotationIntrospector.hasAsValue(annotatedField))) {
                if (this._jsonValueAccessors == null) {
                    this._jsonValueAccessors = new LinkedList<>();
                }
                this._jsonValueAccessors.add(annotatedField);
            } else {
                boolean equals = bool.equals(annotationIntrospector.hasAnyGetter(annotatedField));
                boolean equals2 = bool.equals(annotationIntrospector.hasAnySetter(annotatedField));
                if (equals || equals2) {
                    if (equals) {
                        if (this._anyGetterField == null) {
                            this._anyGetterField = new LinkedList<>();
                        }
                        this._anyGetterField.add(annotatedField);
                    }
                    if (equals2) {
                        if (this._anySetterField == null) {
                            this._anySetterField = new LinkedList<>();
                        }
                        this._anySetterField.add(annotatedField);
                    }
                } else {
                    String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedField);
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = annotatedField.getName();
                    }
                    String modifyFieldName = this._accessorNaming.modifyFieldName(annotatedField, findImplicitPropertyName);
                    if (modifyFieldName != null) {
                        PropertyName _propNameFromSimple = _propNameFromSimple(modifyFieldName);
                        PropertyName findRenameByField = annotationIntrospector.findRenameByField(this._config, annotatedField, _propNameFromSimple);
                        if (findRenameByField != null && !findRenameByField.equals(_propNameFromSimple)) {
                            if (this._fieldRenameMappings == null) {
                                this._fieldRenameMappings = new HashMap();
                            }
                            this._fieldRenameMappings.put(findRenameByField, _propNameFromSimple);
                        }
                        PropertyName findNameForSerialization = this._forSerialization ? annotationIntrospector.findNameForSerialization(annotatedField) : annotationIntrospector.findNameForDeserialization(annotatedField);
                        boolean z11 = findNameForSerialization != null;
                        if (z11 && findNameForSerialization.isEmpty()) {
                            findNameForSerialization = _propNameFromSimple(modifyFieldName);
                            z2 = false;
                        } else {
                            z2 = z11;
                        }
                        boolean z12 = findNameForSerialization != null;
                        if (!z12) {
                            z12 = this._visibilityChecker.isFieldVisible(annotatedField);
                        }
                        boolean hasIgnoreMarker = annotationIntrospector.hasIgnoreMarker(annotatedField);
                        if (annotatedField.isTransient() && !z11) {
                            if (isEnabled) {
                                hasIgnoreMarker = true;
                            }
                            z12 = false;
                        }
                        if (!z10 || findNameForSerialization != null || hasIgnoreMarker || !Modifier.isFinal(annotatedField.getModifiers())) {
                            _property(map, modifyFieldName).addField(annotatedField, findNameForSerialization, z2, z12, hasIgnoreMarker);
                        }
                    }
                }
            }
        }
    }

    public void _addGetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        PropertyName propertyName;
        boolean z2;
        boolean z10;
        String str;
        boolean isGetterVisible;
        Class<?> rawReturnType = annotatedMethod.getRawReturnType();
        if (rawReturnType != Void.TYPE) {
            if (rawReturnType != Void.class || this._config.isEnabled(MapperFeature.ALLOW_VOID_VALUED_PROPERTIES)) {
                Boolean bool = Boolean.TRUE;
                if (bool.equals(annotationIntrospector.hasAnyGetter(annotatedMethod))) {
                    if (this._anyGetters == null) {
                        this._anyGetters = new LinkedList<>();
                    }
                    this._anyGetters.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsKey(this._config, annotatedMethod))) {
                    if (this._jsonKeyAccessors == null) {
                        this._jsonKeyAccessors = new LinkedList<>();
                    }
                    this._jsonKeyAccessors.add(annotatedMethod);
                    return;
                }
                if (bool.equals(annotationIntrospector.hasAsValue(annotatedMethod))) {
                    if (this._jsonValueAccessors == null) {
                        this._jsonValueAccessors = new LinkedList<>();
                    }
                    this._jsonValueAccessors.add(annotatedMethod);
                    return;
                }
                PropertyName findNameForSerialization = annotationIntrospector.findNameForSerialization(annotatedMethod);
                boolean z11 = false;
                boolean z12 = findNameForSerialization != null;
                if (z12) {
                    String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (findImplicitPropertyName == null && (findImplicitPropertyName = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName())) == null) {
                        findImplicitPropertyName = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (findImplicitPropertyName == null) {
                        findImplicitPropertyName = annotatedMethod.getName();
                    }
                    if (findNameForSerialization.isEmpty()) {
                        findNameForSerialization = _propNameFromSimple(findImplicitPropertyName);
                    } else {
                        z11 = z12;
                    }
                    propertyName = findNameForSerialization;
                    z2 = z11;
                    z10 = true;
                    str = findImplicitPropertyName;
                } else {
                    str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
                    if (str == null) {
                        str = this._accessorNaming.findNameForRegularGetter(annotatedMethod, annotatedMethod.getName());
                    }
                    if (str == null) {
                        str = this._accessorNaming.findNameForIsGetter(annotatedMethod, annotatedMethod.getName());
                        if (str == null) {
                            return;
                        } else {
                            isGetterVisible = this._visibilityChecker.isIsGetterVisible(annotatedMethod);
                        }
                    } else {
                        isGetterVisible = this._visibilityChecker.isGetterVisible(annotatedMethod);
                    }
                    propertyName = findNameForSerialization;
                    z10 = isGetterVisible;
                    z2 = z12;
                }
                _property(map, _checkRenameByField(str)).addGetter(annotatedMethod, propertyName, z2, z10, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
            }
        }
    }

    public void _addInjectables(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMember annotatedMember : this._classDef.fields()) {
            _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMember), annotatedMember);
        }
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            if (annotatedMethod.getParameterCount() == 1) {
                _doAddInjectable(this._annotationIntrospector.findInjectableValue(annotatedMethod), annotatedMethod);
            }
        }
    }

    public void _addMethods(Map<String, POJOPropertyBuilder> map) {
        for (AnnotatedMethod annotatedMethod : this._classDef.memberMethods()) {
            int parameterCount = annotatedMethod.getParameterCount();
            if (parameterCount == 0) {
                _addGetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 1) {
                _addSetterMethod(map, annotatedMethod, this._annotationIntrospector);
            } else if (parameterCount == 2 && Boolean.TRUE.equals(this._annotationIntrospector.hasAnySetter(annotatedMethod))) {
                if (this._anySetters == null) {
                    this._anySetters = new LinkedList<>();
                }
                this._anySetters.add(annotatedMethod);
            }
        }
    }

    public void _addSetterMethod(Map<String, POJOPropertyBuilder> map, AnnotatedMethod annotatedMethod, AnnotationIntrospector annotationIntrospector) {
        boolean z2;
        String str;
        PropertyName findNameForDeserialization = annotationIntrospector.findNameForDeserialization(annotatedMethod);
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = findNameForDeserialization != null;
        if (z12) {
            String findImplicitPropertyName = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (findImplicitPropertyName == null) {
                findImplicitPropertyName = annotatedMethod.getName();
            }
            if (findNameForDeserialization.isEmpty()) {
                findNameForDeserialization = _propNameFromSimple(findImplicitPropertyName);
            } else {
                z10 = z12;
            }
            z2 = z10;
            str = findImplicitPropertyName;
        } else {
            str = annotationIntrospector.findImplicitPropertyName(annotatedMethod);
            if (str == null) {
                str = this._accessorNaming.findNameForMutator(annotatedMethod, annotatedMethod.getName());
            }
            if (str == null) {
                return;
            }
            z11 = this._visibilityChecker.isSetterVisible(annotatedMethod);
            z2 = z12;
        }
        PropertyName propertyName = findNameForDeserialization;
        boolean z13 = z11;
        _property(map, _checkRenameByField(str)).addSetter(annotatedMethod, propertyName, z2, z13, annotationIntrospector.hasIgnoreMarker(annotatedMethod));
    }

    public void _collectIgnorals(String str) {
        if (this._forSerialization || str == null) {
            return;
        }
        if (this._ignoredPropertyNames == null) {
            this._ignoredPropertyNames = new HashSet<>();
        }
        this._ignoredPropertyNames.add(str);
    }

    public void _doAddInjectable(JacksonInject.Value value, AnnotatedMember annotatedMember) {
        if (value == null) {
            return;
        }
        Object id = value.getId();
        if (this._injectables == null) {
            this._injectables = new LinkedHashMap<>();
        }
        AnnotatedMember put = this._injectables.put(id, annotatedMember);
        if (put == null || put.getClass() != annotatedMember.getClass()) {
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(10818) + id + StubApp.getString2(10819) + id.getClass().getName() + StubApp.getString2(74));
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, PropertyName propertyName) {
        String simpleName = propertyName.getSimpleName();
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(simpleName);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, propertyName);
        map.put(simpleName, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }

    public void _removeUnwantedAccessor(Map<String, POJOPropertyBuilder> map) {
        boolean isEnabled = this._config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().removeNonVisible(isEnabled, this._forSerialization ? null : this);
        }
    }

    public void _removeUnwantedProperties(Map<String, POJOPropertyBuilder> map) {
        Iterator<POJOPropertyBuilder> it = map.values().iterator();
        while (it.hasNext()) {
            POJOPropertyBuilder next = it.next();
            if (!next.anyVisible()) {
                it.remove();
            } else if (next.anyIgnorals()) {
                if (next.anyExplicitsWithoutIgnoral()) {
                    next.removeIgnored();
                    if (!next.couldDeserialize()) {
                        _collectIgnorals(next.getName());
                    }
                } else {
                    it.remove();
                    _collectIgnorals(next.getName());
                }
            }
        }
    }

    public void _renameProperties(Map<String, POJOPropertyBuilder> map) {
        HashSet<String> hashSet;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            Set<PropertyName> findExplicitNames = value.findExplicitNames();
            if (!findExplicitNames.isEmpty()) {
                it.remove();
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                if (findExplicitNames.size() == 1) {
                    linkedList.add(value.withName(findExplicitNames.iterator().next()));
                } else {
                    linkedList.addAll(value.explode(findExplicitNames));
                }
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
                if (_replaceCreatorProperty(pOJOPropertyBuilder, this._creatorProperties) && (hashSet = this._ignoredPropertyNames) != null) {
                    hashSet.remove(name);
                }
            }
        }
    }

    public void _renameWithWrappers(Map<String, POJOPropertyBuilder> map) {
        PropertyName findWrapperName;
        Iterator<Map.Entry<String, POJOPropertyBuilder>> it = map.entrySet().iterator();
        LinkedList linkedList = null;
        while (it.hasNext()) {
            POJOPropertyBuilder value = it.next().getValue();
            AnnotatedMember primaryMember = value.getPrimaryMember();
            if (primaryMember != null && (findWrapperName = this._annotationIntrospector.findWrapperName(primaryMember)) != null && findWrapperName.hasSimpleName() && !findWrapperName.equals(value.getFullName())) {
                if (linkedList == null) {
                    linkedList = new LinkedList();
                }
                linkedList.add(value.withName(findWrapperName));
                it.remove();
            }
        }
        if (linkedList != null) {
            Iterator it2 = linkedList.iterator();
            while (it2.hasNext()) {
                POJOPropertyBuilder pOJOPropertyBuilder = (POJOPropertyBuilder) it2.next();
                String name = pOJOPropertyBuilder.getName();
                POJOPropertyBuilder pOJOPropertyBuilder2 = map.get(name);
                if (pOJOPropertyBuilder2 == null) {
                    map.put(name, pOJOPropertyBuilder);
                } else {
                    pOJOPropertyBuilder2.addAll(pOJOPropertyBuilder);
                }
            }
        }
    }

    public boolean _replaceCreatorProperty(POJOPropertyBuilder pOJOPropertyBuilder, List<POJOPropertyBuilder> list) {
        if (list != null) {
            String internalName = pOJOPropertyBuilder.getInternalName();
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (list.get(i3).getInternalName().equals(internalName)) {
                    list.set(i3, pOJOPropertyBuilder);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean _resolveFieldVsGetter(List<AnnotatedMember> list) {
        do {
            AnnotatedMember annotatedMember = list.get(0);
            AnnotatedMember annotatedMember2 = list.get(1);
            if (!(annotatedMember instanceof AnnotatedField)) {
                if ((annotatedMember instanceof AnnotatedMethod) && (annotatedMember2 instanceof AnnotatedField)) {
                    list.remove(1);
                }
                return false;
            }
            if (!(annotatedMember2 instanceof AnnotatedMethod)) {
                return false;
            }
            list.remove(0);
        } while (list.size() > 1);
        return true;
    }

    public void _sortProperties(Map<String, POJOPropertyBuilder> map) {
        Collection<POJOPropertyBuilder> collection;
        AnnotationIntrospector annotationIntrospector = this._annotationIntrospector;
        Boolean findSerializationSortAlphabetically = annotationIntrospector.findSerializationSortAlphabetically(this._classDef);
        boolean shouldSortPropertiesAlphabetically = findSerializationSortAlphabetically == null ? this._config.shouldSortPropertiesAlphabetically() : findSerializationSortAlphabetically.booleanValue();
        boolean _anyIndexed = _anyIndexed(map.values());
        String[] findSerializationPropertyOrder = annotationIntrospector.findSerializationPropertyOrder(this._classDef);
        if (shouldSortPropertiesAlphabetically || _anyIndexed || this._creatorProperties != null || findSerializationPropertyOrder != null) {
            int size = map.size();
            Map<? extends Object, ? extends Object> treeMap = shouldSortPropertiesAlphabetically ? new TreeMap<>() : new LinkedHashMap<>(size + size);
            for (POJOPropertyBuilder pOJOPropertyBuilder : map.values()) {
                treeMap.put(pOJOPropertyBuilder.getName(), pOJOPropertyBuilder);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(size + size);
            if (findSerializationPropertyOrder != null) {
                for (String str : findSerializationPropertyOrder) {
                    POJOPropertyBuilder pOJOPropertyBuilder2 = (POJOPropertyBuilder) treeMap.remove(str);
                    if (pOJOPropertyBuilder2 == null) {
                        Iterator<POJOPropertyBuilder> it = map.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            POJOPropertyBuilder next = it.next();
                            if (str.equals(next.getInternalName())) {
                                str = next.getName();
                                pOJOPropertyBuilder2 = next;
                                break;
                            }
                        }
                    }
                    if (pOJOPropertyBuilder2 != null) {
                        linkedHashMap.put(str, pOJOPropertyBuilder2);
                    }
                }
            }
            if (_anyIndexed) {
                TreeMap treeMap2 = new TreeMap();
                Iterator<Map.Entry<? extends Object, ? extends Object>> it2 = treeMap.entrySet().iterator();
                while (it2.hasNext()) {
                    POJOPropertyBuilder pOJOPropertyBuilder3 = (POJOPropertyBuilder) it2.next().getValue();
                    Integer index = pOJOPropertyBuilder3.getMetadata().getIndex();
                    if (index != null) {
                        treeMap2.put(index, pOJOPropertyBuilder3);
                        it2.remove();
                    }
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder4 : treeMap2.values()) {
                    linkedHashMap.put(pOJOPropertyBuilder4.getName(), pOJOPropertyBuilder4);
                }
            }
            if (this._creatorProperties != null && (!shouldSortPropertiesAlphabetically || this._config.isEnabled(MapperFeature.SORT_CREATOR_PROPERTIES_FIRST))) {
                if (shouldSortPropertiesAlphabetically) {
                    TreeMap treeMap3 = new TreeMap();
                    Iterator<POJOPropertyBuilder> it3 = this._creatorProperties.iterator();
                    while (it3.hasNext()) {
                        POJOPropertyBuilder next2 = it3.next();
                        treeMap3.put(next2.getName(), next2);
                    }
                    collection = treeMap3.values();
                } else {
                    collection = this._creatorProperties;
                }
                for (POJOPropertyBuilder pOJOPropertyBuilder5 : collection) {
                    String name = pOJOPropertyBuilder5.getName();
                    if (treeMap.containsKey(name)) {
                        linkedHashMap.put(name, pOJOPropertyBuilder5);
                    }
                }
            }
            linkedHashMap.putAll(treeMap);
            map.clear();
            map.putAll(linkedHashMap);
        }
    }

    public void collectAll() {
        LinkedHashMap<String, POJOPropertyBuilder> linkedHashMap = new LinkedHashMap<>();
        _addFields(linkedHashMap);
        _addMethods(linkedHashMap);
        if (!this._classDef.isNonStaticInnerClass()) {
            _addCreators(linkedHashMap);
        }
        _removeUnwantedProperties(linkedHashMap);
        _removeUnwantedAccessor(linkedHashMap);
        _renameProperties(linkedHashMap);
        _addInjectables(linkedHashMap);
        Iterator<POJOPropertyBuilder> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().mergeAnnotations(this._forSerialization);
        }
        _findNamingStrategy();
        Iterator<POJOPropertyBuilder> it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            it2.next().trimByVisibility();
        }
        if (this._config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) {
            _renameWithWrappers(linkedHashMap);
        }
        _sortProperties(linkedHashMap);
        this._properties = linkedHashMap;
        this._collected = true;
    }

    public AnnotatedMember getAnyGetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem(StubApp.getString2(10820), this._anyGetterField.get(0), this._anyGetterField.get(1));
        }
        return this._anyGetterField.getFirst();
    }

    public AnnotatedMember getAnyGetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anyGetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem(StubApp.getString2(10821), this._anyGetters.get(0), this._anyGetters.get(1));
        }
        return this._anyGetters.getFirst();
    }

    public AnnotatedMember getAnySetterField() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._anySetterField;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem(StubApp.getString2(10822), this._anySetterField.get(0), this._anySetterField.get(1));
        }
        return this._anySetterField.getFirst();
    }

    public AnnotatedMethod getAnySetterMethod() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMethod> linkedList = this._anySetters;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1) {
            reportProblem(StubApp.getString2(10823), this._anySetters.get(0), this._anySetters.get(1));
        }
        return this._anySetters.getFirst();
    }

    public AnnotatedClass getClassDef() {
        return this._classDef;
    }

    public MapperConfig<?> getConfig() {
        return this._config;
    }

    public Set<String> getIgnoredPropertyNames() {
        return this._ignoredPropertyNames;
    }

    public Map<Object, AnnotatedMember> getInjectables() {
        if (!this._collected) {
            collectAll();
        }
        return this._injectables;
    }

    public AnnotatedMember getJsonKeyAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonKeyAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonKeyAccessors)) {
            reportProblem(StubApp.getString2(10824), this._jsonKeyAccessors.get(0), this._jsonKeyAccessors.get(1));
        }
        return this._jsonKeyAccessors.get(0);
    }

    public AnnotatedMember getJsonValueAccessor() {
        if (!this._collected) {
            collectAll();
        }
        LinkedList<AnnotatedMember> linkedList = this._jsonValueAccessors;
        if (linkedList == null) {
            return null;
        }
        if (linkedList.size() > 1 && !_resolveFieldVsGetter(this._jsonValueAccessors)) {
            reportProblem(StubApp.getString2(10825), this._jsonValueAccessors.get(0), this._jsonValueAccessors.get(1));
        }
        return this._jsonValueAccessors.get(0);
    }

    public ObjectIdInfo getObjectIdInfo() {
        ObjectIdInfo findObjectIdInfo = this._annotationIntrospector.findObjectIdInfo(this._classDef);
        return findObjectIdInfo != null ? this._annotationIntrospector.findObjectReferenceInfo(this._classDef, findObjectIdInfo) : findObjectIdInfo;
    }

    public List<BeanPropertyDefinition> getProperties() {
        return new ArrayList(getPropertyMap().values());
    }

    public Map<String, POJOPropertyBuilder> getPropertyMap() {
        if (!this._collected) {
            collectAll();
        }
        return this._properties;
    }

    public JavaType getType() {
        return this._type;
    }

    public void reportProblem(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        throw new IllegalArgumentException(StubApp.getString2(10826) + this._classDef + StubApp.getString2(994) + str);
    }

    public POJOPropertyBuilder _property(Map<String, POJOPropertyBuilder> map, String str) {
        POJOPropertyBuilder pOJOPropertyBuilder = map.get(str);
        if (pOJOPropertyBuilder != null) {
            return pOJOPropertyBuilder;
        }
        POJOPropertyBuilder pOJOPropertyBuilder2 = new POJOPropertyBuilder(this._config, this._annotationIntrospector, this._forSerialization, PropertyName.construct(str));
        map.put(str, pOJOPropertyBuilder2);
        return pOJOPropertyBuilder2;
    }
}
