package streamapi;

/** Represent a student. */
public record recordStudent(String name, int cps, Enrollment program) {

    /**
     * Check if a student is enrolled in Computer Science.
     *
     * @return {@code true}, iff the student is enrolled in Computer Science, otherwise {@code false}
     */
    public boolean isIFM() {
        return program == Enrollment.IFM;
    }
}
