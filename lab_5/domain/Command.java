package domain;
public interface Command {
    public void execute();
    public void undo();
}
/**
 * Реалізація команди для виконання операції та її скасування.
 * Цей клас виконує операцію в методі execute() та скасовує цю операцію в методі undo().
 */
