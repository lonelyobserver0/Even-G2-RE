package com.mapbox.api.directions.v5;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.mapbox.api.directions.v5.models.Admin;
import com.mapbox.api.directions.v5.models.Amenity;
import com.mapbox.api.directions.v5.models.BannerComponents;
import com.mapbox.api.directions.v5.models.BannerInstructions;
import com.mapbox.api.directions.v5.models.BannerText;
import com.mapbox.api.directions.v5.models.BannerView;
import com.mapbox.api.directions.v5.models.Closure;
import com.mapbox.api.directions.v5.models.Congestion;
import com.mapbox.api.directions.v5.models.CostPerVehicleSize;
import com.mapbox.api.directions.v5.models.DirectionsError;
import com.mapbox.api.directions.v5.models.DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.api.directions.v5.models.DirectionsWaypoint;
import com.mapbox.api.directions.v5.models.Incident;
import com.mapbox.api.directions.v5.models.Interchange;
import com.mapbox.api.directions.v5.models.IntersectionLaneAccess;
import com.mapbox.api.directions.v5.models.IntersectionLanes;
import com.mapbox.api.directions.v5.models.Junction;
import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.LegStep;
import com.mapbox.api.directions.v5.models.MapboxShield;
import com.mapbox.api.directions.v5.models.MapboxStreetsV8;
import com.mapbox.api.directions.v5.models.MaxSpeed;
import com.mapbox.api.directions.v5.models.MergingArea;
import com.mapbox.api.directions.v5.models.Metadata;
import com.mapbox.api.directions.v5.models.Notification;
import com.mapbox.api.directions.v5.models.NotificationDetails;
import com.mapbox.api.directions.v5.models.PaymentMethods;
import com.mapbox.api.directions.v5.models.RestStop;
import com.mapbox.api.directions.v5.models.RouteLeg;
import com.mapbox.api.directions.v5.models.RouteOptions;
import com.mapbox.api.directions.v5.models.ShieldSprite;
import com.mapbox.api.directions.v5.models.ShieldSpriteAttribute;
import com.mapbox.api.directions.v5.models.ShieldSprites;
import com.mapbox.api.directions.v5.models.ShieldSvg;
import com.mapbox.api.directions.v5.models.SilentWaypoint;
import com.mapbox.api.directions.v5.models.StepIntersection;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.mapbox.api.directions.v5.models.TollCollection;
import com.mapbox.api.directions.v5.models.TollCost;
import com.mapbox.api.directions.v5.models.TrafficCodes;
import com.mapbox.api.directions.v5.models.VoiceInstructions;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
final class AutoValueGson_DirectionsAdapterFactory extends DirectionsAdapterFactory {
    @Override // com.google.gson.TypeAdapterFactory
    public final TypeAdapter create(Gson gson, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (Admin.class.isAssignableFrom(rawType)) {
            return Admin.typeAdapter(gson);
        }
        if (Amenity.class.isAssignableFrom(rawType)) {
            return Amenity.typeAdapter(gson);
        }
        if (BannerComponents.class.isAssignableFrom(rawType)) {
            return BannerComponents.typeAdapter(gson);
        }
        if (BannerInstructions.class.isAssignableFrom(rawType)) {
            return BannerInstructions.typeAdapter(gson);
        }
        if (BannerText.class.isAssignableFrom(rawType)) {
            return BannerText.typeAdapter(gson);
        }
        if (BannerView.class.isAssignableFrom(rawType)) {
            return BannerView.typeAdapter(gson);
        }
        if (Closure.class.isAssignableFrom(rawType)) {
            return Closure.typeAdapter(gson);
        }
        if (Congestion.class.isAssignableFrom(rawType)) {
            return Congestion.typeAdapter(gson);
        }
        if (CostPerVehicleSize.class.isAssignableFrom(rawType)) {
            return CostPerVehicleSize.typeAdapter(gson);
        }
        if (DirectionsError.class.isAssignableFrom(rawType)) {
            return DirectionsError.typeAdapter(gson);
        }
        if (DirectionsResponse.class.isAssignableFrom(rawType)) {
            return DirectionsResponse.typeAdapter(gson);
        }
        if (DirectionsRoute.class.isAssignableFrom(rawType)) {
            return DirectionsRoute.typeAdapter(gson);
        }
        if (DirectionsWaypoint.class.isAssignableFrom(rawType)) {
            return DirectionsWaypoint.typeAdapter(gson);
        }
        if (Incident.class.isAssignableFrom(rawType)) {
            return Incident.typeAdapter(gson);
        }
        if (Interchange.class.isAssignableFrom(rawType)) {
            return Interchange.typeAdapter(gson);
        }
        if (IntersectionLaneAccess.class.isAssignableFrom(rawType)) {
            return IntersectionLaneAccess.typeAdapter(gson);
        }
        if (IntersectionLanes.class.isAssignableFrom(rawType)) {
            return IntersectionLanes.typeAdapter(gson);
        }
        if (Junction.class.isAssignableFrom(rawType)) {
            return Junction.typeAdapter(gson);
        }
        if (LegAnnotation.class.isAssignableFrom(rawType)) {
            return LegAnnotation.typeAdapter(gson);
        }
        if (LegStep.class.isAssignableFrom(rawType)) {
            return LegStep.typeAdapter(gson);
        }
        if (MapboxShield.class.isAssignableFrom(rawType)) {
            return MapboxShield.typeAdapter(gson);
        }
        if (MapboxStreetsV8.class.isAssignableFrom(rawType)) {
            return MapboxStreetsV8.typeAdapter(gson);
        }
        if (MaxSpeed.class.isAssignableFrom(rawType)) {
            return MaxSpeed.typeAdapter(gson);
        }
        if (MergingArea.class.isAssignableFrom(rawType)) {
            return MergingArea.typeAdapter(gson);
        }
        if (Metadata.class.isAssignableFrom(rawType)) {
            return Metadata.typeAdapter(gson);
        }
        if (Notification.class.isAssignableFrom(rawType)) {
            return Notification.typeAdapter(gson);
        }
        if (NotificationDetails.class.isAssignableFrom(rawType)) {
            return NotificationDetails.typeAdapter(gson);
        }
        if (PaymentMethods.class.isAssignableFrom(rawType)) {
            return PaymentMethods.typeAdapter(gson);
        }
        if (RestStop.class.isAssignableFrom(rawType)) {
            return RestStop.typeAdapter(gson);
        }
        if (RouteLeg.class.isAssignableFrom(rawType)) {
            return RouteLeg.typeAdapter(gson);
        }
        if (RouteOptions.class.isAssignableFrom(rawType)) {
            return RouteOptions.typeAdapter(gson);
        }
        if (ShieldSprite.class.isAssignableFrom(rawType)) {
            return ShieldSprite.typeAdapter(gson);
        }
        if (ShieldSpriteAttribute.class.isAssignableFrom(rawType)) {
            return ShieldSpriteAttribute.typeAdapter(gson);
        }
        if (ShieldSprites.class.isAssignableFrom(rawType)) {
            return ShieldSprites.typeAdapter(gson);
        }
        if (ShieldSvg.class.isAssignableFrom(rawType)) {
            return ShieldSvg.typeAdapter(gson);
        }
        if (SilentWaypoint.class.isAssignableFrom(rawType)) {
            return SilentWaypoint.typeAdapter(gson);
        }
        if (StepIntersection.class.isAssignableFrom(rawType)) {
            return StepIntersection.typeAdapter(gson);
        }
        if (StepManeuver.class.isAssignableFrom(rawType)) {
            return StepManeuver.typeAdapter(gson);
        }
        if (TollCollection.class.isAssignableFrom(rawType)) {
            return TollCollection.typeAdapter(gson);
        }
        if (TollCost.class.isAssignableFrom(rawType)) {
            return TollCost.typeAdapter(gson);
        }
        if (TrafficCodes.class.isAssignableFrom(rawType)) {
            return TrafficCodes.typeAdapter(gson);
        }
        if (VoiceInstructions.class.isAssignableFrom(rawType)) {
            return VoiceInstructions.typeAdapter(gson);
        }
        return null;
    }
}
