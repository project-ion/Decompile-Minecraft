/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class abs
/*   4:    */   extends abq
/*   5:    */ {
/*   6:    */   public abs(aqu paramaqu)
/*   7:    */   {
/*   8: 17 */     super(paramaqu);
/*   9: 18 */     a(0.9F, 1.3F);
/*  10:    */     
/*  11: 20 */     ((aay)s()).a(true);
/*  12: 21 */     this.i.a(0, new yy(this));
/*  13: 22 */     this.i.a(1, new zu(this, 2.0D));
/*  14: 23 */     this.i.a(2, new yt(this, 1.0D));
/*  15: 24 */     this.i.a(3, new aag(this, 1.25D, amk.O, false));
/*  16: 25 */     this.i.a(4, new za(this, 1.25D));
/*  17: 26 */     this.i.a(5, new zy(this, 1.0D));
/*  18: 27 */     this.i.a(6, new zh(this, ahd.class, 6.0F));
/*  19: 28 */     this.i.a(7, new zx(this));
/*  20:    */   }
/*  21:    */   
/*  22:    */   protected void aW()
/*  23:    */   {
/*  24: 33 */     super.aW();
/*  25:    */     
/*  26: 35 */     a(afs.a).a(10.0D);
/*  27: 36 */     a(afs.d).a(0.2000000029802322D);
/*  28:    */   }
/*  29:    */   
/*  30:    */   protected String z()
/*  31:    */   {
/*  32: 41 */     return "mob.cow.say";
/*  33:    */   }
/*  34:    */   
/*  35:    */   protected String bn()
/*  36:    */   {
/*  37: 46 */     return "mob.cow.hurt";
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected String bo()
/*  41:    */   {
/*  42: 51 */     return "mob.cow.hurt";
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void a(dt paramdt, atr paramatr)
/*  46:    */   {
/*  47: 56 */     a("mob.cow.step", 0.15F, 1.0F);
/*  48:    */   }
/*  49:    */   
/*  50:    */   protected float bA()
/*  51:    */   {
/*  52: 61 */     return 0.4F;
/*  53:    */   }
/*  54:    */   
/*  55:    */   protected alq A()
/*  56:    */   {
/*  57: 66 */     return amk.aF;
/*  58:    */   }
/*  59:    */   
/*  60:    */   protected void b(boolean paramBoolean, int paramInt)
/*  61:    */   {
/*  62: 72 */     int i = this.V.nextInt(3) + this.V.nextInt(1 + paramInt);
/*  63: 73 */     for (int j = 0; j < i; j++) {
/*  64: 74 */       a(amk.aF, 1);
/*  65:    */     }
/*  66: 77 */     i = this.V.nextInt(3) + 1 + this.V.nextInt(1 + paramInt);
/*  67: 78 */     for (j = 0; j < i; j++) {
/*  68: 79 */       if (au()) {
/*  69: 80 */         a(amk.bj, 1);
/*  70:    */       } else {
/*  71: 82 */         a(amk.bi, 1);
/*  72:    */       }
/*  73:    */     }
/*  74:    */   }
/*  75:    */   
/*  76:    */   public boolean a(ahd paramahd)
/*  77:    */   {
/*  78: 89 */     amj localamj = paramahd.bg.h();
/*  79: 90 */     if ((localamj != null) && (localamj.b() == amk.aw) && (!paramahd.by.d))
/*  80:    */     {
/*  81: 91 */       if (localamj.b-- == 1) {
/*  82: 92 */         paramahd.bg.a(paramahd.bg.c, new amj(amk.aG));
/*  83: 93 */       } else if (!paramahd.bg.a(new amj(amk.aG))) {
/*  84: 94 */         paramahd.a(new amj(amk.aG, 1, 0), false);
/*  85:    */       }
/*  86: 97 */       return true;
/*  87:    */     }
/*  88: 99 */     return super.a(paramahd);
/*  89:    */   }
/*  90:    */   
/*  91:    */   public abs b(ws paramws)
/*  92:    */   {
/*  93:104 */     return new abs(this.o);
/*  94:    */   }
/*  95:    */   
/*  96:    */   public float aR()
/*  97:    */   {
/*  98:109 */     return this.K;
/*  99:    */   }
/* 100:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     abs
 * JD-Core Version:    0.7.0.1
 */