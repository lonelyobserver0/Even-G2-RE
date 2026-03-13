package com.fasterxml.jackson.databind.introspect;

import Xa.h;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.stub.StubApp;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class AnnotatedClass extends Annotated implements TypeResolutionContext {
    private static final Creators NO_CREATORS;
    protected final AnnotationIntrospector _annotationIntrospector;
    protected final TypeBindings _bindings;
    protected final Class<?> _class;
    protected final Annotations _classAnnotations;
    protected final boolean _collectAnnotations;
    protected Creators _creators;
    protected List<AnnotatedField> _fields;
    protected AnnotatedMethodMap _memberMethods;
    protected final ClassIntrospector.MixInResolver _mixInResolver;
    protected transient Boolean _nonStaticInnerClass;
    protected final Class<?> _primaryMixIn;
    protected final List<JavaType> _superTypes;
    protected final JavaType _type;
    protected final TypeFactory _typeFactory;

    public static final class Creators {
        public final List<AnnotatedConstructor> constructors;
        public final List<AnnotatedMethod> creatorMethods;
        public final AnnotatedConstructor defaultConstructor;

        public Creators(AnnotatedConstructor annotatedConstructor, List<AnnotatedConstructor> list, List<AnnotatedMethod> list2) {
            this.defaultConstructor = annotatedConstructor;
            this.constructors = list;
            this.creatorMethods = list2;
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        NO_CREATORS = new Creators(null, list, list);
    }

    public AnnotatedClass(JavaType javaType, Class<?> cls, List<JavaType> list, Class<?> cls2, Annotations annotations, TypeBindings typeBindings, AnnotationIntrospector annotationIntrospector, ClassIntrospector.MixInResolver mixInResolver, TypeFactory typeFactory, boolean z2) {
        this._type = javaType;
        this._class = cls;
        this._superTypes = list;
        this._primaryMixIn = cls2;
        this._classAnnotations = annotations;
        this._bindings = typeBindings;
        this._annotationIntrospector = annotationIntrospector;
        this._mixInResolver = mixInResolver;
        this._typeFactory = typeFactory;
        this._collectAnnotations = z2;
    }

    private final Creators _creators() {
        AnnotatedClass annotatedClass;
        Creators collectCreators;
        Creators creators = this._creators;
        if (creators != null) {
            return creators;
        }
        JavaType javaType = this._type;
        if (javaType == null) {
            collectCreators = NO_CREATORS;
            annotatedClass = this;
        } else {
            annotatedClass = this;
            collectCreators = AnnotatedCreatorCollector.collectCreators(this._annotationIntrospector, this._typeFactory, annotatedClass, javaType, this._primaryMixIn, this._collectAnnotations);
        }
        annotatedClass._creators = collectCreators;
        return collectCreators;
    }

    private final List<AnnotatedField> _fields() {
        AnnotatedClass annotatedClass;
        List<AnnotatedField> collectFields;
        List<AnnotatedField> list = this._fields;
        if (list != null) {
            return list;
        }
        JavaType javaType = this._type;
        if (javaType == null) {
            collectFields = Collections.EMPTY_LIST;
            annotatedClass = this;
        } else {
            annotatedClass = this;
            collectFields = AnnotatedFieldCollector.collectFields(this._annotationIntrospector, annotatedClass, this._mixInResolver, this._typeFactory, javaType, this._collectAnnotations);
        }
        annotatedClass._fields = collectFields;
        return collectFields;
    }

    private final AnnotatedMethodMap _methods() {
        AnnotatedClass annotatedClass;
        AnnotatedMethodMap collectMethods;
        AnnotatedMethodMap annotatedMethodMap = this._memberMethods;
        if (annotatedMethodMap != null) {
            return annotatedMethodMap;
        }
        JavaType javaType = this._type;
        if (javaType == null) {
            collectMethods = new AnnotatedMethodMap();
            annotatedClass = this;
        } else {
            annotatedClass = this;
            collectMethods = AnnotatedMethodCollector.collectMethods(this._annotationIntrospector, annotatedClass, this._mixInResolver, this._typeFactory, javaType, this._superTypes, this._primaryMixIn, this._collectAnnotations);
        }
        annotatedClass._memberMethods = collectMethods;
        return collectMethods;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return ClassUtil.hasClass(obj, AnnotatedClass.class) && ((AnnotatedClass) obj)._class == this._class;
    }

    public Iterable<AnnotatedField> fields() {
        return _fields();
    }

    public AnnotatedMethod findMethod(String str, Class<?>[] clsArr) {
        return _methods().find(str, clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getAnnotated() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this._classAnnotations.get(cls);
    }

    public Annotations getAnnotations() {
        return this._classAnnotations;
    }

    public List<AnnotatedConstructor> getConstructors() {
        return _creators().constructors;
    }

    public AnnotatedConstructor getDefaultConstructor() {
        return _creators().defaultConstructor;
    }

    public List<AnnotatedMethod> getFactoryMethods() {
        return _creators().creatorMethods;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String getName() {
        return this._class.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public Class<?> getRawType() {
        return this._class;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public JavaType getType() {
        return this._type;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasAnnotation(Class<?> cls) {
        return this._classAnnotations.has(cls);
    }

    public boolean hasAnnotations() {
        return this._classAnnotations.size() > 0;
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        return this._classAnnotations.hasOneOf(clsArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public int hashCode() {
        return this._class.getName().hashCode();
    }

    public boolean isNonStaticInnerClass() {
        Boolean bool = this._nonStaticInnerClass;
        if (bool == null) {
            bool = Boolean.valueOf(ClassUtil.isNonStaticInnerClass(this._class));
            this._nonStaticInnerClass = bool;
        }
        return bool.booleanValue();
    }

    public Iterable<AnnotatedMethod> memberMethods() {
        return _methods();
    }

    @Override // com.fasterxml.jackson.databind.introspect.TypeResolutionContext
    public JavaType resolveType(Type type) {
        return this._typeFactory.resolveMemberType(type, this._bindings);
    }

    @Override // com.fasterxml.jackson.databind.introspect.Annotated
    public String toString() {
        return h.k(this._class, new StringBuilder(StubApp.getString2(10779)), StubApp.getString2(511));
    }

    public AnnotatedClass(Class<?> cls) {
        this._type = null;
        this._class = cls;
        this._superTypes = Collections.EMPTY_LIST;
        this._primaryMixIn = null;
        this._classAnnotations = AnnotationCollector.emptyAnnotations();
        this._bindings = TypeBindings.emptyBindings();
        this._annotationIntrospector = null;
        this._mixInResolver = null;
        this._typeFactory = null;
        this._collectAnnotations = false;
    }
}
