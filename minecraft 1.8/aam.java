/*   1:    */ import com.google.common.base.Predicate;
/*   2:    */ import java.util.Collections;
/*   3:    */ import java.util.List;
/*   4:    */ import org.apache.logging.log4j.LogManager;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ public class aam
/*   8:    */   extends zb
/*   9:    */ {
/*  10: 24 */   private static final Logger a = ;
/*  11:    */   private xn b;
/*  12:    */   private final Predicate c;
/*  13:    */   private final aas d;
/*  14:    */   private xm e;
/*  15:    */   private Class f;
/*  16:    */   
/*  17:    */   public aam(xn paramxn, Class paramClass)
/*  18:    */   {
/*  19: 33 */     this.b = paramxn;
/*  20: 34 */     this.f = paramClass;
/*  21: 36 */     if ((paramxn instanceof xu)) {
/*  22: 37 */       a.warn("Use NearestAttackableTargetGoal.class for PathfinerMob mobs!");
/*  23:    */     }
/*  24: 40 */     this.c = new aan(this);
/*  25:    */     
/*  26:    */ 
/*  27:    */ 
/*  28:    */ 
/*  29:    */ 
/*  30:    */ 
/*  31:    */ 
/*  32:    */ 
/*  33:    */ 
/*  34:    */ 
/*  35:    */ 
/*  36:    */ 
/*  37:    */ 
/*  38:    */ 
/*  39:    */ 
/*  40:    */ 
/*  41:    */ 
/*  42: 58 */     this.d = new aas(paramxn);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public boolean a()
/*  46:    */   {
/*  47: 63 */     double d1 = f();
/*  48: 64 */     List localList = this.b.o.a(this.f, this.b.aQ().b(d1, 4.0D, d1), this.c);
/*  49: 65 */     Collections.sort(localList, this.d);
/*  50: 67 */     if (localList.isEmpty()) {
/*  51: 68 */       return false;
/*  52:    */     }
/*  53: 70 */     this.e = ((xm)localList.get(0));
/*  54: 71 */     return true;
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean b()
/*  58:    */   {
/*  59: 77 */     xm localxm = this.b.u();
/*  60: 78 */     if (localxm == null) {
/*  61: 79 */       return false;
/*  62:    */     }
/*  63: 81 */     if (!localxm.ai()) {
/*  64: 82 */       return false;
/*  65:    */     }
/*  66: 85 */     double d1 = f();
/*  67: 86 */     if (this.b.h(localxm) > d1 * d1) {
/*  68: 87 */       return false;
/*  69:    */     }
/*  70: 89 */     if (((localxm instanceof qw)) && 
/*  71: 90 */       (((qw)localxm).c.d())) {
/*  72: 91 */       return false;
/*  73:    */     }
/*  74: 94 */     return true;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public void c()
/*  78:    */   {
/*  79: 99 */     this.b.d(this.e);
/*  80:100 */     super.c();
/*  81:    */   }
/*  82:    */   
/*  83:    */   public void d()
/*  84:    */   {
/*  85:105 */     this.b.d(null);
/*  86:106 */     super.c();
/*  87:    */   }
/*  88:    */   
/*  89:    */   protected double f()
/*  90:    */   {
/*  91:110 */     xz localxz = this.b.a(afs.b);
/*  92:111 */     return localxz == null ? 16.0D : localxz.e();
/*  93:    */   }
/*  94:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aam
 * JD-Core Version:    0.7.0.1
 */