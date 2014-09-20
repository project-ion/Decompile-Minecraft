/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public abstract class cjc
/*  5:   */ {
/*  6:   */   private double c;
/*  7:   */   private double d;
/*  8:   */   private double e;
/*  9:13 */   protected List a = Lists.newArrayListWithCapacity(17424);
/* 10:   */   protected boolean b;
/* 11:   */   
/* 12:   */   public void a(double paramDouble1, double paramDouble2, double paramDouble3)
/* 13:   */   {
/* 14:18 */     this.b = true;
/* 15:19 */     this.a.clear();
/* 16:   */     
/* 17:21 */     this.c = paramDouble1;
/* 18:22 */     this.d = paramDouble2;
/* 19:23 */     this.e = paramDouble3;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void a(cop paramcop)
/* 23:   */   {
/* 24:27 */     dt localdt = paramcop.j();
/* 25:28 */     cjm.b((float)(localdt.n() - this.c), (float)(localdt.o() - this.d), (float)(localdt.p() - this.e));
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void a(cop paramcop, aql paramaql)
/* 29:   */   {
/* 30:32 */     this.a.add(paramcop);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public abstract void a(aql paramaql);
/* 34:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cjc
 * JD-Core Version:    0.7.0.1
 */