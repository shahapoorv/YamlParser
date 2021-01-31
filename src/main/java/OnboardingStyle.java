public enum OnboardingStyle {
    PARTNERONBOARDING{
        @Override
        public String toString() {
            return "PartnerOnboarding";
        }
    },
    GENERICONBOARDING{
        @Override
        public String toString() {
            return "GenericOnboarding";
        }
    }
}
