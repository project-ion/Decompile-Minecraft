/*   1:    */ import com.google.common.base.Objects;
/*   2:    */ import com.google.common.base.Predicate;
/*   3:    */ import com.google.common.base.Predicates;
/*   4:    */ 
/*   5:    */ public class bvc
/*   6:    */   extends bvf
/*   7:    */ {
/*   8:    */   private final Predicate a;
/*   9:    */   
/*  10:    */   public bvc(int paramInt, String paramString, boolean paramBoolean, Predicate paramPredicate)
/*  11:    */   {
/*  12:468 */     super(paramInt, paramString, paramBoolean);
/*  13:469 */     this.a = ((Predicate)Objects.firstNonNull(paramPredicate, Predicates.alwaysTrue()));
/*  14:    */   }
/*  15:    */   
/*  16:    */   public Predicate a()
/*  17:    */   {
/*  18:473 */     return this.a;
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bvc
 * JD-Core Version:    0.7.0.1
 */