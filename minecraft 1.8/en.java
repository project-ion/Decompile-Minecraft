/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import com.google.common.collect.Iterators;
/*   3:    */ import java.util.Iterator;
/*   4:    */ import java.util.Random;
/*   5:    */ 
/*   6:    */ public enum en
/*   7:    */   implements Predicate, Iterable
/*   8:    */ {
/*   9:    */   public ej[] a()
/*  10:    */   {
/*  11:405 */     switch (ek.c[ordinal()])
/*  12:    */     {
/*  13:    */     case 1: 
/*  14:407 */       return new ej[] { ej.c, ej.f, ej.d, ej.e };
/*  15:    */     case 2: 
/*  16:409 */       return new ej[] { ej.b, ej.a };
/*  17:    */     }
/*  18:411 */     throw new Error("Someone's been tampering with the universe!");
/*  19:    */   }
/*  20:    */   
/*  21:    */   public ej a(Random paramRandom)
/*  22:    */   {
/*  23:425 */     ej[] arrayOfej = a();
/*  24:426 */     return arrayOfej[paramRandom.nextInt(arrayOfej.length)];
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean a(ej paramej)
/*  28:    */   {
/*  29:436 */     return (paramej != null) && (paramej.k().d() == this);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public Iterator iterator()
/*  33:    */   {
/*  34:441 */     return Iterators.forArray(a());
/*  35:    */   }
/*  36:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     en
 * JD-Core Version:    0.7.0.1
 */