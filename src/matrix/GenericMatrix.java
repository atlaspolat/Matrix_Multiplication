package matrix;

public class GenericMatrix implements Matrix {
	
	private double[][] matrix;
	
	public GenericMatrix(int rows, int cols) {
		matrix = new double[rows][cols];
	}
	
	public GenericMatrix(double[][] matrix) {
		this.matrix = matrix;
	}
	
	
	
	

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return matrix.length;
	}

	@Override
	public int getCols() {
		// TODO Auto-generated method stub
		return matrix[0].length;
	}

	@Override
	public double get(int row, int col) {
		// TODO Auto-generated method stub
		return matrix[row][col];
	}

	@Override
	public void set(int row, int col, double value) {
		// TODO Auto-generated method stub
		matrix[row][col] = value;
		
	}

	@Override
	public Matrix add(Matrix other) {
		// TODO Auto-generated method stub
		
		if (this.getRows() != other.getRows() || this.getCols() != other.getCols()) {
			throw new IllegalArgumentException("Matrices must have the same dimensions");
		}
		
		double[][] result = new double[this.getRows()][this.getCols()];
		return other;
	}

	@Override
	public Matrix multiply(Matrix other) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matrix transpose() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Matrix scalarMultiply(double scalar) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double determinant() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isSquare() {
		// TODO Auto-generated method stub
		return false;
	}

}
