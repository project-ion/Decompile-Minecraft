/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class asz
/*   4:    */   extends avt
/*   5:    */ {
/*   6: 28 */   public static final beu a = beu.a("facing", en.a);
/*   7: 29 */   public static final bew b = bew.a("damage", 0, 2);
/*   8:    */   
/*   9:    */   protected asz()
/*  10:    */   {
/*  11: 33 */     super(bof.g);
/*  12: 34 */     j(this.L.b().a(a, ej.c).a(b, Integer.valueOf(0)));
/*  13: 35 */     e(0);
/*  14: 36 */     a(akf.c);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public boolean d()
/*  18:    */   {
/*  19: 41 */     return false;
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean c()
/*  23:    */   {
/*  24: 46 */     return false;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  28:    */   {
/*  29: 51 */     ej localej = paramxm.aO().e();
/*  30: 52 */     return super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).a(a, localej).a(b, Integer.valueOf(paramInt >> 2));
/*  31:    */   }
/*  32:    */   
/*  33:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  34:    */   {
/*  35: 57 */     if (!paramaqu.D) {
/*  36: 58 */       paramahd.a(new ata(paramaqu, paramdt));
/*  37:    */     }
/*  38: 61 */     return true;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public int a(bec parambec)
/*  42:    */   {
/*  43: 66 */     return ((Integer)parambec.b(b)).intValue();
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void a(ard paramard, dt paramdt)
/*  47:    */   {
/*  48: 71 */     ej localej = (ej)paramard.p(paramdt).b(a);
/*  49: 72 */     if (localej.k() == el.a) {
/*  50: 73 */       a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
/*  51:    */     } else {
/*  52: 75 */       a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
/*  53:    */     }
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  57:    */   {
/*  58: 81 */     paramList.add(new amj(paramalq, 1, 0));
/*  59: 82 */     paramList.add(new amj(paramalq, 1, 1));
/*  60: 83 */     paramList.add(new amj(paramalq, 1, 2));
/*  61:    */   }
/*  62:    */   
/*  63:    */   protected void a(adv paramadv)
/*  64:    */   {
/*  65: 88 */     paramadv.a(true);
/*  66:    */   }
/*  67:    */   
/*  68:    */   public void a_(aqu paramaqu, dt paramdt)
/*  69:    */   {
/*  70: 93 */     paramaqu.b(1022, paramdt, 0);
/*  71:    */   }
/*  72:    */   
/*  73:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  74:    */   {
/*  75: 98 */     return true;
/*  76:    */   }
/*  77:    */   
/*  78:    */   public bec b(bec parambec)
/*  79:    */   {
/*  80:140 */     return P().a(a, ej.d);
/*  81:    */   }
/*  82:    */   
/*  83:    */   public bec a(int paramInt)
/*  84:    */   {
/*  85:145 */     return P().a(a, ej.b(paramInt & 0x3)).a(b, Integer.valueOf((paramInt & 0xF) >> 2));
/*  86:    */   }
/*  87:    */   
/*  88:    */   public int c(bec parambec)
/*  89:    */   {
/*  90:152 */     int i = 0;
/*  91:    */     
/*  92:154 */     i |= ((ej)parambec.b(a)).b();
/*  93:155 */     i |= ((Integer)parambec.b(b)).intValue() << 2;
/*  94:    */     
/*  95:157 */     return i;
/*  96:    */   }
/*  97:    */   
/*  98:    */   protected bed e()
/*  99:    */   {
/* 100:162 */     return new bed(this, new bex[] { a, b });
/* 101:    */   }
/* 102:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     asz
 * JD-Core Version:    0.7.0.1
 */