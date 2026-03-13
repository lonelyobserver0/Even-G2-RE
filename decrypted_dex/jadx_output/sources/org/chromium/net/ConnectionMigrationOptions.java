package org.chromium.net;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ConnectionMigrationOptions {
    private final Boolean mAllowNonDefaultNetworkUsage;
    private final Boolean mAllowServerMigration;
    private final Boolean mEnableDefaultNetworkMigration;
    private final Boolean mEnablePathDegradationMigration;
    private final Long mIdleMigrationPeriodSeconds;
    private final Integer mMaxPathDegradingEagerMigrationsCount;
    private final Long mMaxTimeOnNonDefaultNetworkSeconds;
    private final Integer mMaxWriteErrorEagerMigrationsCount;
    private final Boolean mMigrateIdleConnections;
    private final Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    public static class Builder {
        private Boolean mAllowNonDefaultNetworkUsage;
        private Boolean mAllowServerMigration;
        private Boolean mEnableDefaultNetworkConnectionMigration;
        private Boolean mEnablePathDegradationMigration;
        private Long mIdleConnectionMigrationPeriodSeconds;
        private Integer mMaxPathDegradingEagerMigrationsCount;
        private Long mMaxTimeOnNonDefaultNetworkSeconds;
        private Integer mMaxWriteErrorEagerMigrationsCount;
        private Boolean mMigrateIdleConnections;
        private Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        @Experimental
        public Builder allowNonDefaultNetworkUsage(boolean z2) {
            this.mAllowNonDefaultNetworkUsage = Boolean.valueOf(z2);
            return this;
        }

        @Experimental
        public Builder allowServerMigration(boolean z2) {
            this.mAllowServerMigration = Boolean.valueOf(z2);
            return this;
        }

        public ConnectionMigrationOptions build() {
            return new ConnectionMigrationOptions(this);
        }

        public Builder enableDefaultNetworkMigration(boolean z2) {
            this.mEnableDefaultNetworkConnectionMigration = Boolean.valueOf(z2);
            return this;
        }

        public Builder enablePathDegradationMigration(boolean z2) {
            this.mEnablePathDegradationMigration = Boolean.valueOf(z2);
            return this;
        }

        @Experimental
        public Builder migrateIdleConnections(boolean z2) {
            this.mMigrateIdleConnections = Boolean.valueOf(z2);
            return this;
        }

        @Experimental
        public Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean z2) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = Boolean.valueOf(z2);
            return this;
        }

        @Experimental
        public Builder setIdleConnectionMigrationPeriodSeconds(long j) {
            this.mIdleConnectionMigrationPeriodSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int i3) {
            this.mMaxPathDegradingEagerMigrationsCount = Integer.valueOf(i3);
            return this;
        }

        @Experimental
        public Builder setMaxTimeOnNonDefaultNetworkSeconds(long j) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = Long.valueOf(j);
            return this;
        }

        @Experimental
        public Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int i3) {
            this.mMaxWriteErrorEagerMigrationsCount = Integer.valueOf(i3);
            return this;
        }
    }

    public @interface Experimental {
    }

    public ConnectionMigrationOptions(Builder builder) {
        this.mEnableDefaultNetworkMigration = builder.mEnableDefaultNetworkConnectionMigration;
        this.mEnablePathDegradationMigration = builder.mEnablePathDegradationMigration;
        this.mAllowServerMigration = builder.mAllowServerMigration;
        this.mMigrateIdleConnections = builder.mMigrateIdleConnections;
        this.mIdleMigrationPeriodSeconds = builder.mIdleConnectionMigrationPeriodSeconds;
        this.mRetryPreHandshakeErrorsOnAlternateNetwork = builder.mRetryPreHandshakeErrorsOnAlternateNetwork;
        this.mAllowNonDefaultNetworkUsage = builder.mAllowNonDefaultNetworkUsage;
        this.mMaxTimeOnNonDefaultNetworkSeconds = builder.mMaxTimeOnNonDefaultNetworkSeconds;
        this.mMaxWriteErrorEagerMigrationsCount = builder.mMaxWriteErrorEagerMigrationsCount;
        this.mMaxPathDegradingEagerMigrationsCount = builder.mMaxPathDegradingEagerMigrationsCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    public Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    public Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    public Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    public Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    public Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    public Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    public Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    public Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    public Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }
}
