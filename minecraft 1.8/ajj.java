/*   1:    */ public class ajj
/*   2:    */   extends ajk
/*   3:    */ {
/*   4:    */   private final ain a;
/*   5:    */   private final ahd b;
/*   6:    */   private int c;
/*   7:    */   
/*   8:    */   public ajj(ahd paramahd, ain paramain, vq paramvq, int paramInt1, int paramInt2, int paramInt3)
/*   9:    */   {
/*  10: 16 */     super(paramvq, paramInt1, paramInt2, paramInt3);
/*  11: 17 */     this.b = paramahd;
/*  12: 18 */     this.a = paramain;
/*  13:    */   }
/*  14:    */   
/*  15:    */   public boolean a(amj paramamj)
/*  16:    */   {
/*  17: 23 */     return false;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public amj a(int paramInt)
/*  21:    */   {
/*  22: 28 */     if (e()) {
/*  23: 29 */       this.c += Math.min(paramInt, d().b);
/*  24:    */     }
/*  25: 31 */     return super.a(paramInt);
/*  26:    */   }
/*  27:    */   
/*  28:    */   protected void a(amj paramamj, int paramInt)
/*  29:    */   {
/*  30: 36 */     this.c += paramInt;
/*  31: 37 */     c(paramamj);
/*  32:    */   }
/*  33:    */   
/*  34:    */   protected void c(amj paramamj)
/*  35:    */   {
/*  36: 42 */     if (this.c > 0) {
/*  37: 43 */       paramamj.a(this.b.o, this.b, this.c);
/*  38:    */     }
/*  39: 45 */     this.c = 0;
/*  40: 47 */     if (paramamj.b() == alq.a(aty.ai)) {
/*  41: 48 */       this.b.b(tl.h);
/*  42:    */     }
/*  43: 50 */     if ((paramamj.b() instanceof amu)) {
/*  44: 51 */       this.b.b(tl.i);
/*  45:    */     }
/*  46: 53 */     if (paramamj.b() == alq.a(aty.al)) {
/*  47: 54 */       this.b.b(tl.j);
/*  48:    */     }
/*  49: 56 */     if ((paramamj.b() instanceof alo)) {
/*  50: 57 */       this.b.b(tl.l);
/*  51:    */     }
/*  52: 59 */     if (paramamj.b() == amk.P) {
/*  53: 60 */       this.b.b(tl.m);
/*  54:    */     }
/*  55: 62 */     if (paramamj.b() == amk.aZ) {
/*  56: 63 */       this.b.b(tl.n);
/*  57:    */     }
/*  58: 65 */     if (((paramamj.b() instanceof amu)) && (((amu)paramamj.b()).g() != ami.a)) {
/*  59: 66 */       this.b.b(tl.o);
/*  60:    */     }
/*  61: 68 */     if ((paramamj.b() instanceof anm)) {
/*  62: 69 */       this.b.b(tl.r);
/*  63:    */     }
/*  64: 71 */     if (paramamj.b() == alq.a(aty.bC)) {
/*  65: 72 */       this.b.b(tl.E);
/*  66:    */     }
/*  67: 74 */     if (paramamj.b() == alq.a(aty.X)) {
/*  68: 75 */       this.b.b(tl.G);
/*  69:    */     }
/*  70: 77 */     if ((paramamj.b() == amk.ao) && (paramamj.i() == 1)) {
/*  71: 78 */       this.b.b(tl.M);
/*  72:    */     }
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(ahd paramahd, amj paramamj)
/*  76:    */   {
/*  77: 84 */     c(paramamj);
/*  78:    */     
/*  79: 86 */     amj[] arrayOfamj = aop.a().b(this.a, paramahd.o);
/*  80: 88 */     for (int i = 0; i < arrayOfamj.length; i++)
/*  81:    */     {
/*  82: 89 */       amj localamj1 = this.a.a(i);
/*  83: 90 */       amj localamj2 = arrayOfamj[i];
/*  84: 92 */       if (localamj1 != null) {
/*  85: 93 */         this.a.a(i, 1);
/*  86:    */       }
/*  87: 96 */       if (localamj2 != null) {
/*  88: 97 */         if (this.a.a(i) == null) {
/*  89: 99 */           this.a.a(i, localamj2);
/*  90:100 */         } else if (!this.b.bg.a(localamj2)) {
/*  91:102 */           this.b.a(localamj2, false);
/*  92:    */         }
/*  93:    */       }
/*  94:    */     }
/*  95:    */   }
/*  96:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ajj
 * JD-Core Version:    0.7.0.1
 */