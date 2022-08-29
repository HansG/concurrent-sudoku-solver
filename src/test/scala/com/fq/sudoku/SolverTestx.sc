import com.fq.sudoku.Solver.{Coord, Value}
import com.fq.sudoku.{FS2StreamSolver, SolverTest}

val stest = new SolverTest
import   stest._

val iolist = FS2StreamSolver.solve( stest.toGiven(testCase1))

iolist.unsafeRunSync()

//val res = testidx(FS2StreamSolver, testCase1, 1)