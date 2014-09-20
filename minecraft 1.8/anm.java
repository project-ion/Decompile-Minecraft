/*   1:    */ import com.google.common.collect.Multimap;
/*   2:    */ 
/*   3:    */ public class anm
/*   4:    */   extends alq
/*   5:    */ {
/*   6:    */   private float a;
/*   7:    */   private final ami b;
/*   8:    */   
/*   9:    */   public anm(ami paramami)
/*  10:    */   {
/*  11: 19 */     this.b = paramami;
/*  12: 20 */     this.h = 1;
/*  13: 21 */     d(paramami.a());
/*  14: 22 */     a(akf.j);
/*  15:    */     
/*  16: 24 */     this.a = (4.0F + paramami.c());
/*  17:    */   }
/*  18:    */   
/*  19:    */   public float g()
/*  20:    */   {
/*  21: 28 */     return this.b.c();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public float a(amj paramamj, atr paramatr)
/*  25:    */   {
/*  26: 33 */     if (paramatr == aty.G) {
/*  27: 35 */       return 15.0F;
/*  28:    */     }
/*  29: 39 */     bof localbof = paramatr.r();
/*  30: 40 */     if ((localbof == bof.k) || (localbof == bof.l) || (localbof == bof.v) || (localbof == bof.j) || (localbof == bof.C)) {
/*  31: 41 */       return 1.5F;
/*  32:    */     }
/*  33: 43 */     return 1.0F;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public boolean a(amj paramamj, xm paramxm1, xm paramxm2)
/*  37:    */   {
/*  38: 48 */     paramamj.a(1, paramxm2);
/*  39: 49 */     return true;
/*  40:    */   }
/*  41:    */   
/*  42:    */   public boolean a(amj paramamj, aqu paramaqu, atr paramatr, dt paramdt, xm paramxm)
/*  43:    */   {
/*  44: 55 */     if (paramatr.g(paramaqu, paramdt) != 0.0D) {
/*  45: 56 */       paramamj.a(2, paramxm);
/*  46:    */     }
/*  47: 58 */     return true;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean v_()
/*  51:    */   {
/*  52: 63 */     return true;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public ano e(amj paramamj)
/*  56:    */   {
/*  57: 68 */     return ano.d;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int d(amj paramamj)
/*  61:    */   {
/*  62: 73 */     return 72000;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/*  66:    */   {
/*  67: 78 */     paramahd.a(paramamj, d(paramamj));
/*  68: 79 */     return paramamj;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean b(atr paramatr)
/*  72:    */   {
/*  73: 84 */     return paramatr == aty.G;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public int b()
/*  77:    */   {
/*  78: 89 */     return this.b.e();
/*  79:    */   }
/*  80:    */   
/*  81:    */   public String h()
/*  82:    */   {
/*  83: 93 */     return this.b.toString();
/*  84:    */   }
/*  85:    */   
/*  86:    */   public boolean a(amj paramamj1, amj paramamj2)
/*  87:    */   {
/*  88: 98 */     if (this.b.f() == paramamj2.b()) {
/*  89: 99 */       return true;
/*  90:    */     }
/*  91:101 */     return super.a(paramamj1, paramamj2);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public Multimap i()
/*  95:    */   {
/*  96:106 */     Multimap localMultimap = super.i();
/*  97:    */     
/*  98:108 */     localMultimap.put(afs.e.a(), new ya(f, "Weapon modifier", this.a, 0));
/*  99:    */     
/* 100:110 */     return localMultimap;
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     anm
 * JD-Core Version:    0.7.0.1
 */