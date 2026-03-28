/**
 * @autor igorogadyarov
 * created 28.03.2026
 */
package home_work_OOP_principles.task1;

public class Patient {
    public int TreatmentPlan;
    Doctor doctor;

    public Patient(int treatmentPlan) {
        if (treatmentPlan == 1) {
            TreatmentPlan = treatmentPlan;
            this.doctor = new Surgeon();
            doctor.treat();
        } else if (treatmentPlan == 2 ) {
            TreatmentPlan = treatmentPlan;
            this.doctor = new Dentist();
            doctor.treat();
        } else {
            TreatmentPlan = treatmentPlan;
            this.doctor = new Therapist();
            doctor.treat();
        }
    }
}
