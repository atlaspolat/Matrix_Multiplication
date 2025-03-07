package matrix;

public interface Matrix {
    int getRows();
    int getCols();
    
    double get(int row, int col);
    void set(int row, int col, double value);
    
    Matrix add(Matrix other);
    Matrix multiply(Matrix other);
    Matrix transpose();
    
    Matrix scalarMultiply(double scalar);
    
    
    double determinant();  // Only for square matrices
    boolean isSquare();
    
    
}
