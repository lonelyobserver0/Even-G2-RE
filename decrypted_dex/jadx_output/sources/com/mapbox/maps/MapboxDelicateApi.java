package com.mapbox.maps;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.RequiresOptIn;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;

@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@RequiresOptIn(level = RequiresOptIn.Level.WARNING, message = "This is a delicate API and its use requires care. Make sure you fully read and understand documentation of the declaration that is marked as a delicate API.")
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY, AnnotationTarget.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
@MustBeDocumented
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/mapbox/maps/MapboxDelicateApi;", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@Documented
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public @interface MapboxDelicateApi {
}
