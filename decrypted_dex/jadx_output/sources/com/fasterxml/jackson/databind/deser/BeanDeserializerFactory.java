package com.fasterxml.jackson.databind.deser;

import Xa.h;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator;
import com.fasterxml.jackson.databind.AbstractTypeResolver;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.ErrorThrowingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.UnsupportedTypeDeserializer;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.IgnorePropertiesUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import com.mapbox.common.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class BeanDeserializerFactory extends BasicDeserializerFactory implements Serializable {
    private static final Class<?>[] INIT_CAUSE_PARAMS = {Throwable.class};
    public static final BeanDeserializerFactory instance = new BeanDeserializerFactory(new DeserializerFactoryConfig());

    public BeanDeserializerFactory(DeserializerFactoryConfig deserializerFactoryConfig) {
        super(deserializerFactoryConfig);
    }

    private boolean _isSetterlessType(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    public JsonDeserializer<Object> _findUnsupportedTypeDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        String checkUnsupportedType = BeanUtil.checkUnsupportedType(javaType);
        if (checkUnsupportedType == null || deserializationContext.getConfig().findMixInClassFor(javaType.getRawClass()) != null) {
            return null;
        }
        return new UnsupportedTypeDeserializer(javaType, checkUnsupportedType);
    }

    public void _validateSubType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        SubTypeValidator.instance().validateSubType(deserializationContext, javaType, beanDescription);
    }

    public void addBackReferenceProperties(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        List<BeanPropertyDefinition> findBackReferences = beanDescription.findBackReferences();
        if (findBackReferences != null) {
            for (BeanPropertyDefinition beanPropertyDefinition : findBackReferences) {
                beanDeserializerBuilder.addBackReferenceProperty(beanPropertyDefinition.findReferenceName(), constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getPrimaryType()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.fasterxml.jackson.databind.deser.BeanDeserializerBuilder] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.fasterxml.jackson.databind.deser.SettableBeanProperty[]] */
    public void addBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        Set<String> set;
        Set<String> set2;
        SettableBeanProperty settableBeanProperty;
        CreatorProperty creatorProperty;
        SettableBeanProperty settableBeanProperty2 = null;
        CreatorProperty[] fromObjectArguments = !beanDescription.getType().isAbstract() ? beanDeserializerBuilder.getValueInstantiator().getFromObjectArguments(deserializationContext.getConfig()) : null;
        boolean z2 = fromObjectArguments != null;
        JsonIgnoreProperties.Value defaultPropertyIgnorals = deserializationContext.getConfig().getDefaultPropertyIgnorals(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyIgnorals != null) {
            beanDeserializerBuilder.setIgnoreUnknownProperties(defaultPropertyIgnorals.getIgnoreUnknown());
            set = defaultPropertyIgnorals.findIgnoredForDeserialization();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                beanDeserializerBuilder.addIgnorable(it.next());
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        JsonIncludeProperties.Value defaultPropertyInclusions = deserializationContext.getConfig().getDefaultPropertyInclusions(beanDescription.getBeanClass(), beanDescription.getClassInfo());
        if (defaultPropertyInclusions != null) {
            set2 = defaultPropertyInclusions.getIncluded();
            if (set2 != null) {
                Iterator<String> it2 = set2.iterator();
                while (it2.hasNext()) {
                    beanDeserializerBuilder.addIncludable(it2.next());
                }
            }
        } else {
            set2 = null;
        }
        AnnotatedMember findAnySetterAccessor = beanDescription.findAnySetterAccessor();
        if (findAnySetterAccessor != null) {
            beanDeserializerBuilder.setAnySetter(constructAnySetter(deserializationContext, beanDescription, findAnySetterAccessor));
        } else {
            Set<String> ignoredPropertyNames = beanDescription.getIgnoredPropertyNames();
            if (ignoredPropertyNames != null) {
                Iterator<String> it3 = ignoredPropertyNames.iterator();
                while (it3.hasNext()) {
                    beanDeserializerBuilder.addIgnorable(it3.next());
                }
            }
        }
        boolean z10 = deserializationContext.isEnabled(MapperFeature.USE_GETTERS_AS_SETTERS) && deserializationContext.isEnabled(MapperFeature.AUTO_DETECT_GETTERS);
        List<BeanPropertyDefinition> filterBeanProps = filterBeanProps(deserializationContext, beanDescription, beanDeserializerBuilder, beanDescription.findProperties(), set, set2);
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it4 = this._factoryConfig.deserializerModifiers().iterator();
            if (it4.hasNext()) {
                if (it4.next() != null) {
                    throw new ClassCastException();
                }
                deserializationContext.getConfig();
                throw null;
            }
        }
        for (BeanPropertyDefinition beanPropertyDefinition : filterBeanProps) {
            if (beanPropertyDefinition.hasSetter()) {
                settableBeanProperty = constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getSetter().getParameterType(0));
            } else if (beanPropertyDefinition.hasField()) {
                settableBeanProperty = constructSettableProperty(deserializationContext, beanDescription, beanPropertyDefinition, beanPropertyDefinition.getField().getType());
            } else {
                AnnotatedMethod getter = beanPropertyDefinition.getGetter();
                if (getter != null) {
                    if (z10 && _isSetterlessType(getter.getRawType())) {
                        if (!beanDeserializerBuilder.hasIgnorable(beanPropertyDefinition.getName())) {
                            settableBeanProperty = constructSetterlessProperty(deserializationContext, beanDescription, beanPropertyDefinition);
                        }
                    } else if (!beanPropertyDefinition.hasConstructorParameter() && beanPropertyDefinition.getMetadata().getMergeInfo() != null) {
                        settableBeanProperty = constructSetterlessProperty(deserializationContext, beanDescription, beanPropertyDefinition);
                    }
                }
                settableBeanProperty = settableBeanProperty2;
            }
            if (z2 && beanPropertyDefinition.hasConstructorParameter()) {
                String name = beanPropertyDefinition.getName();
                int length = fromObjectArguments.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        creatorProperty = null;
                        break;
                    }
                    CreatorProperty creatorProperty2 = fromObjectArguments[i3];
                    if (name.equals(creatorProperty2.getName()) && (creatorProperty2 instanceof CreatorProperty)) {
                        creatorProperty = creatorProperty2;
                        break;
                    }
                    i3++;
                }
                if (creatorProperty == null) {
                    ArrayList arrayList = new ArrayList();
                    for (CreatorProperty creatorProperty3 : fromObjectArguments) {
                        arrayList.add(creatorProperty3.getName());
                    }
                    deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "Could not find creator property with name %s (known Creator properties: %s)", ClassUtil.name(name), arrayList);
                } else {
                    if (settableBeanProperty != null) {
                        creatorProperty.setFallbackSetter(settableBeanProperty);
                    }
                    Class<?>[] findViews = beanPropertyDefinition.findViews();
                    if (findViews == null) {
                        findViews = beanDescription.findDefaultViews();
                    }
                    creatorProperty.setViews(findViews);
                    beanDeserializerBuilder.addCreatorProperty(creatorProperty);
                }
            } else if (settableBeanProperty != null) {
                Class<?>[] findViews2 = beanPropertyDefinition.findViews();
                if (findViews2 == null) {
                    findViews2 = beanDescription.findDefaultViews();
                }
                settableBeanProperty.setViews(findViews2);
                beanDeserializerBuilder.addProperty(settableBeanProperty);
            }
            settableBeanProperty2 = null;
        }
    }

    public void addInjectables(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        Map<Object, AnnotatedMember> findInjectables = beanDescription.findInjectables();
        if (findInjectables != null) {
            for (Map.Entry<Object, AnnotatedMember> entry : findInjectables.entrySet()) {
                AnnotatedMember value = entry.getValue();
                beanDeserializerBuilder.addInjectable(PropertyName.construct(value.getName()), value.getType(), beanDescription.getClassAnnotations(), value, entry.getKey());
            }
        }
    }

    public void addObjectIdReader(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder) throws JsonMappingException {
        SettableBeanProperty settableBeanProperty;
        ObjectIdGenerator<?> objectIdGeneratorInstance;
        JavaType javaType;
        ObjectIdInfo objectIdInfo = beanDescription.getObjectIdInfo();
        if (objectIdInfo == null) {
            return;
        }
        Class<? extends ObjectIdGenerator<?>> generatorType = objectIdInfo.getGeneratorType();
        deserializationContext.objectIdResolverInstance(beanDescription.getClassInfo(), objectIdInfo);
        if (generatorType == ObjectIdGenerators$PropertyGenerator.class) {
            PropertyName propertyName = objectIdInfo.getPropertyName();
            settableBeanProperty = beanDeserializerBuilder.findProperty(propertyName);
            if (settableBeanProperty == null) {
                throw new IllegalArgumentException(AbstractC1482f.i("Invalid Object Id definition for ", ClassUtil.getTypeDescription(beanDescription.getType()), ": cannot find property with name ", ClassUtil.name(propertyName)));
            }
            JavaType type = settableBeanProperty.getType();
            javaType = type;
            objectIdGeneratorInstance = new PropertyBasedObjectIdGenerator(objectIdInfo.getScope());
        } else {
            JavaType javaType2 = deserializationContext.getTypeFactory().findTypeParameters(deserializationContext.constructType((Class<?>) generatorType), ObjectIdGenerator.class)[0];
            settableBeanProperty = null;
            objectIdGeneratorInstance = deserializationContext.objectIdGeneratorInstance(beanDescription.getClassInfo(), objectIdInfo);
            javaType = javaType2;
        }
        SettableBeanProperty settableBeanProperty2 = settableBeanProperty;
        beanDeserializerBuilder.setObjectIdReader(ObjectIdReader.construct(javaType, objectIdInfo.getPropertyName(), objectIdGeneratorInstance, deserializationContext.findRootValueDeserializer(javaType), settableBeanProperty2, null));
    }

    public JsonDeserializer<Object> buildBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            deserializationContext.getConfig();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
                if (it.hasNext()) {
                    throw b.e(it);
                }
            }
            JsonDeserializer<?> build = (!javaType.isAbstract() || findValueInstantiator.canInstantiate()) ? constructBeanDeserializerBuilder.build() : constructBeanDeserializerBuilder.buildAbstract();
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
                if (it2.hasNext()) {
                    throw b.e(it2);
                }
            }
            return build;
        } catch (IllegalArgumentException e10) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e10), beanDescription, (BeanPropertyDefinition) null).withCause(e10);
        } catch (NoClassDefFoundError e11) {
            return new ErrorThrowingDeserializer(e11);
        }
    }

    public JsonDeserializer<Object> buildBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        try {
            ValueInstantiator findValueInstantiator = findValueInstantiator(deserializationContext, beanDescription);
            DeserializationConfig config = deserializationContext.getConfig();
            BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
            constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator);
            addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addObjectIdReader(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addBackReferenceProperties(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            addInjectables(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
            JsonPOJOBuilder.Value findPOJOBuilderConfig = beanDescription.findPOJOBuilderConfig();
            String str = findPOJOBuilderConfig == null ? "build" : findPOJOBuilderConfig.buildMethodName;
            AnnotatedMethod findMethod = beanDescription.findMethod(str, null);
            if (findMethod != null && config.canOverrideAccessModifiers()) {
                ClassUtil.checkAndFixAccess(findMethod.getMember(), config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
            }
            constructBeanDeserializerBuilder.setPOJOBuilder(findMethod, findPOJOBuilderConfig);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
                if (it.hasNext()) {
                    throw b.e(it);
                }
            }
            JsonDeserializer<?> buildBuilderBased = constructBeanDeserializerBuilder.buildBuilderBased(javaType, str);
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
                if (it2.hasNext()) {
                    throw b.e(it2);
                }
            }
            return buildBuilderBased;
        } catch (IllegalArgumentException e10) {
            throw InvalidDefinitionException.from(deserializationContext.getParser(), ClassUtil.exceptionMessage(e10), beanDescription, (BeanPropertyDefinition) null);
        } catch (NoClassDefFoundError e11) {
            return new ErrorThrowingDeserializer(e11);
        }
    }

    public JsonDeserializer<Object> buildThrowableDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        DeserializationConfig config = deserializationContext.getConfig();
        BeanDeserializerBuilder constructBeanDeserializerBuilder = constructBeanDeserializerBuilder(deserializationContext, beanDescription);
        constructBeanDeserializerBuilder.setValueInstantiator(findValueInstantiator(deserializationContext, beanDescription));
        addBeanProps(deserializationContext, beanDescription, constructBeanDeserializerBuilder);
        Iterator<SettableBeanProperty> properties = constructBeanDeserializerBuilder.getProperties();
        while (true) {
            if (!properties.hasNext()) {
                break;
            }
            if ("setCause".equals(properties.next().getMember().getName())) {
                properties.remove();
                break;
            }
        }
        AnnotatedMethod findMethod = beanDescription.findMethod("initCause", INIT_CAUSE_PARAMS);
        if (findMethod != null) {
            config.getPropertyNamingStrategy();
            SettableBeanProperty constructSettableProperty = constructSettableProperty(deserializationContext, beanDescription, SimpleBeanPropertyDefinition.construct(deserializationContext.getConfig(), findMethod, new PropertyName("cause")), findMethod.getParameterType(0));
            if (constructSettableProperty != null) {
                constructBeanDeserializerBuilder.addOrReplaceProperty(constructSettableProperty, true);
            }
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
            if (it.hasNext()) {
                throw b.e(it);
            }
        }
        JsonDeserializer<?> build = constructBeanDeserializerBuilder.build();
        if (build instanceof BeanDeserializer) {
            build = ThrowableDeserializer.construct(deserializationContext, (BeanDeserializer) build);
        }
        if (this._factoryConfig.hasDeserializerModifiers()) {
            Iterator<BeanDeserializerModifier> it2 = this._factoryConfig.deserializerModifiers().iterator();
            if (it2.hasNext()) {
                throw b.e(it2);
            }
        }
        return build;
    }

    public SettableAnyProperty constructAnySetter(DeserializationContext deserializationContext, BeanDescription beanDescription, AnnotatedMember annotatedMember) throws JsonMappingException {
        JavaType keyType;
        JavaType contentType;
        AnnotatedMember annotatedMember2;
        BeanProperty.Std std;
        boolean z2 = annotatedMember instanceof AnnotatedField;
        if (annotatedMember instanceof AnnotatedMethod) {
            AnnotatedMethod annotatedMethod = (AnnotatedMethod) annotatedMember;
            keyType = annotatedMethod.getParameterType(0);
            contentType = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, annotatedMethod.getParameterType(1));
            annotatedMember2 = annotatedMember;
            std = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), contentType, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
        } else {
            if (!z2) {
                return (SettableAnyProperty) deserializationContext.reportBadDefinition(beanDescription.getType(), "Unrecognized mutator type for any-setter: " + ClassUtil.nameOf(annotatedMember.getClass()));
            }
            JavaType type = ((AnnotatedField) annotatedMember).getType();
            if (!type.isMapLikeType()) {
                if (type.hasRawClass(JsonNode.class) || type.hasRawClass(ObjectNode.class)) {
                    JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, type);
                    JavaType constructType = deserializationContext.constructType(JsonNode.class);
                    return SettableAnyProperty.constructForJsonNodeField(deserializationContext, new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), resolveMemberAndTypeAnnotations, null, annotatedMember, PropertyMetadata.STD_OPTIONAL), annotatedMember, constructType, deserializationContext.findRootValueDeserializer(constructType));
                }
                return (SettableAnyProperty) deserializationContext.reportBadDefinition(beanDescription.getType(), "Unsupported type for any-setter: " + ClassUtil.getTypeDescription(type) + " -- only support `Map`s, `JsonNode` and `ObjectNode` ");
            }
            JavaType resolveMemberAndTypeAnnotations2 = resolveMemberAndTypeAnnotations(deserializationContext, annotatedMember, type);
            keyType = resolveMemberAndTypeAnnotations2.getKeyType();
            contentType = resolveMemberAndTypeAnnotations2.getContentType();
            BeanProperty.Std std2 = new BeanProperty.Std(PropertyName.construct(annotatedMember.getName()), resolveMemberAndTypeAnnotations2, null, annotatedMember, PropertyMetadata.STD_OPTIONAL);
            annotatedMember2 = annotatedMember;
            std = std2;
        }
        JavaType javaType = contentType;
        KeyDeserializer findKeyDeserializerFromAnnotation = findKeyDeserializerFromAnnotation(deserializationContext, annotatedMember2);
        if (findKeyDeserializerFromAnnotation == null) {
            findKeyDeserializerFromAnnotation = (KeyDeserializer) keyType.getValueHandler();
        }
        if (findKeyDeserializerFromAnnotation == null) {
            findKeyDeserializerFromAnnotation = deserializationContext.findKeyDeserializer(keyType, std);
        }
        KeyDeserializer keyDeserializer = findKeyDeserializerFromAnnotation;
        JsonDeserializer<Object> findContentDeserializerFromAnnotation = findContentDeserializerFromAnnotation(deserializationContext, annotatedMember2);
        if (findContentDeserializerFromAnnotation == null) {
            findContentDeserializerFromAnnotation = (JsonDeserializer) javaType.getValueHandler();
        }
        if (findContentDeserializerFromAnnotation != null) {
            findContentDeserializerFromAnnotation = deserializationContext.handlePrimaryContextualization(findContentDeserializerFromAnnotation, std, javaType);
        }
        JsonDeserializer<Object> jsonDeserializer = findContentDeserializerFromAnnotation;
        TypeDeserializer typeDeserializer = (TypeDeserializer) javaType.getTypeHandler();
        return z2 ? SettableAnyProperty.constructForMapField(deserializationContext, std, annotatedMember2, javaType, keyDeserializer, jsonDeserializer, typeDeserializer) : SettableAnyProperty.constructForMethod(deserializationContext, std, annotatedMember2, javaType, keyDeserializer, jsonDeserializer, typeDeserializer);
    }

    public BeanDeserializerBuilder constructBeanDeserializerBuilder(DeserializationContext deserializationContext, BeanDescription beanDescription) {
        return new BeanDeserializerBuilder(beanDescription, deserializationContext);
    }

    public SettableBeanProperty constructSettableProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition, JavaType javaType) throws JsonMappingException {
        BeanPropertyDefinition beanPropertyDefinition2;
        SettableBeanProperty fieldProperty;
        AnnotatedMember nonConstructorMutator = beanPropertyDefinition.getNonConstructorMutator();
        if (nonConstructorMutator == null) {
            deserializationContext.reportBadPropertyDefinition(beanDescription, beanPropertyDefinition, "No non-constructor mutator available", new Object[0]);
        }
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, nonConstructorMutator, javaType);
        TypeDeserializer typeDeserializer = (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler();
        if (nonConstructorMutator instanceof AnnotatedMethod) {
            beanPropertyDefinition2 = beanPropertyDefinition;
            fieldProperty = new MethodProperty(beanPropertyDefinition2, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedMethod) nonConstructorMutator);
        } else {
            beanPropertyDefinition2 = beanPropertyDefinition;
            fieldProperty = new FieldProperty(beanPropertyDefinition2, resolveMemberAndTypeAnnotations, typeDeserializer, beanDescription.getClassAnnotations(), (AnnotatedField) nonConstructorMutator);
        }
        JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, nonConstructorMutator);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        if (findDeserializerFromAnnotation != null) {
            fieldProperty = fieldProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, fieldProperty, resolveMemberAndTypeAnnotations));
        }
        AnnotationIntrospector.ReferenceProperty findReferenceType = beanPropertyDefinition2.findReferenceType();
        if (findReferenceType != null && findReferenceType.isManagedReference()) {
            fieldProperty.setManagedReferenceName(findReferenceType.getName());
        }
        ObjectIdInfo findObjectIdInfo = beanPropertyDefinition2.findObjectIdInfo();
        if (findObjectIdInfo != null) {
            fieldProperty.setObjectIdInfo(findObjectIdInfo);
        }
        return fieldProperty;
    }

    public SettableBeanProperty constructSetterlessProperty(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanPropertyDefinition beanPropertyDefinition) throws JsonMappingException {
        AnnotatedMethod getter = beanPropertyDefinition.getGetter();
        JavaType resolveMemberAndTypeAnnotations = resolveMemberAndTypeAnnotations(deserializationContext, getter, getter.getType());
        SetterlessProperty setterlessProperty = new SetterlessProperty(beanPropertyDefinition, resolveMemberAndTypeAnnotations, (TypeDeserializer) resolveMemberAndTypeAnnotations.getTypeHandler(), beanDescription.getClassAnnotations(), getter);
        JsonDeserializer<?> findDeserializerFromAnnotation = findDeserializerFromAnnotation(deserializationContext, getter);
        if (findDeserializerFromAnnotation == null) {
            findDeserializerFromAnnotation = (JsonDeserializer) resolveMemberAndTypeAnnotations.getValueHandler();
        }
        return findDeserializerFromAnnotation != null ? setterlessProperty.withValueDeserializer(deserializationContext.handlePrimaryContextualization(findDeserializerFromAnnotation, setterlessProperty, resolveMemberAndTypeAnnotations)) : setterlessProperty;
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBeanDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JavaType materializeAbstractType;
        DeserializationConfig config = deserializationContext.getConfig();
        JsonDeserializer<Object> _findCustomBeanDeserializer = _findCustomBeanDeserializer(javaType, config, beanDescription);
        if (_findCustomBeanDeserializer != null) {
            if (this._factoryConfig.hasDeserializerModifiers()) {
                Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    deserializationContext.getConfig();
                    throw null;
                }
            }
            return _findCustomBeanDeserializer;
        }
        if (javaType.isThrowable()) {
            return buildThrowableDeserializer(deserializationContext, javaType, beanDescription);
        }
        if (javaType.isAbstract() && !javaType.isPrimitive() && !javaType.isEnumType() && (materializeAbstractType = materializeAbstractType(deserializationContext, javaType, beanDescription)) != null) {
            return buildBeanDeserializer(deserializationContext, materializeAbstractType, config.introspect(materializeAbstractType));
        }
        JsonDeserializer<?> findStdDeserializer = findStdDeserializer(deserializationContext, javaType, beanDescription);
        if (findStdDeserializer != null) {
            return findStdDeserializer;
        }
        if (!isPotentialBeanType(javaType.getRawClass())) {
            return null;
        }
        _validateSubType(deserializationContext, javaType, beanDescription);
        JsonDeserializer<Object> _findUnsupportedTypeDeserializer = _findUnsupportedTypeDeserializer(deserializationContext, javaType, beanDescription);
        return _findUnsupportedTypeDeserializer != null ? _findUnsupportedTypeDeserializer : buildBeanDeserializer(deserializationContext, javaType, beanDescription);
    }

    @Override // com.fasterxml.jackson.databind.deser.DeserializerFactory
    public JsonDeserializer<Object> createBuilderBasedDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription, Class<?> cls) throws JsonMappingException {
        return buildBuilderBasedDeserializer(deserializationContext, javaType, deserializationContext.getConfig().introspectForBuilder(deserializationContext.isEnabled(MapperFeature.INFER_BUILDER_TYPE_BINDINGS) ? deserializationContext.getTypeFactory().constructParametricType(cls, javaType.getBindings()) : deserializationContext.constructType(cls), beanDescription));
    }

    public List<BeanPropertyDefinition> filterBeanProps(DeserializationContext deserializationContext, BeanDescription beanDescription, BeanDeserializerBuilder beanDeserializerBuilder, List<BeanPropertyDefinition> list, Set<String> set, Set<String> set2) {
        Class<?> rawPrimaryType;
        ArrayList arrayList = new ArrayList(Math.max(4, list.size()));
        HashMap hashMap = new HashMap();
        for (BeanPropertyDefinition beanPropertyDefinition : list) {
            String name = beanPropertyDefinition.getName();
            if (!IgnorePropertiesUtil.shouldIgnore(name, set, set2)) {
                if (beanPropertyDefinition.hasConstructorParameter() || (rawPrimaryType = beanPropertyDefinition.getRawPrimaryType()) == null || !isIgnorableType(deserializationContext.getConfig(), beanPropertyDefinition, rawPrimaryType, hashMap)) {
                    arrayList.add(beanPropertyDefinition);
                } else {
                    beanDeserializerBuilder.addIgnorable(name);
                }
            }
        }
        return arrayList;
    }

    public JsonDeserializer<?> findStdDeserializer(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        JsonDeserializer<?> findDefaultDeserializer = findDefaultDeserializer(deserializationContext, javaType, beanDescription);
        if (findDefaultDeserializer == null || !this._factoryConfig.hasDeserializerModifiers()) {
            return findDefaultDeserializer;
        }
        Iterator<BeanDeserializerModifier> it = this._factoryConfig.deserializerModifiers().iterator();
        if (!it.hasNext()) {
            return findDefaultDeserializer;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        deserializationContext.getConfig();
        throw null;
    }

    public boolean isIgnorableType(DeserializationConfig deserializationConfig, BeanPropertyDefinition beanPropertyDefinition, Class<?> cls, Map<Class<?>, Boolean> map) {
        Boolean bool;
        Boolean bool2 = map.get(cls);
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        if (cls == String.class || cls.isPrimitive()) {
            bool = Boolean.FALSE;
        } else {
            bool = deserializationConfig.getConfigOverride(cls).getIsIgnoredType();
            if (bool == null) {
                bool = deserializationConfig.getAnnotationIntrospector().isIgnorableType(deserializationConfig.introspectClassAnnotations(cls).getClassInfo());
                if (bool == null) {
                    bool = Boolean.FALSE;
                }
            }
        }
        map.put(cls, bool);
        return bool.booleanValue();
    }

    public boolean isPotentialBeanType(Class<?> cls) {
        String canBeABeanType = ClassUtil.canBeABeanType(cls);
        if (canBeABeanType != null) {
            throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + canBeABeanType + ") as a Bean");
        }
        if (ClassUtil.isProxyType(cls)) {
            throw new IllegalArgumentException(h.k(cls, new StringBuilder("Cannot deserialize Proxy class "), " as a Bean"));
        }
        String isLocalType = ClassUtil.isLocalType(cls, true);
        if (isLocalType == null) {
            return true;
        }
        throw new IllegalArgumentException("Cannot deserialize Class " + cls.getName() + " (of type " + isLocalType + ") as a Bean");
    }

    public JavaType materializeAbstractType(DeserializationContext deserializationContext, JavaType javaType, BeanDescription beanDescription) throws JsonMappingException {
        Iterator<AbstractTypeResolver> it = this._factoryConfig.abstractTypeResolvers().iterator();
        if (!it.hasNext()) {
            return null;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        deserializationContext.getConfig();
        throw null;
    }
}
