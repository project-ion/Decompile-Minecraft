/*  1:   */ public class are
/*  2:   */ {
/*  3: 4 */   public static final are[] a = new are[16];
/*  4: 6 */   public static final are b = new are(0, "default", 1).i();
/*  5: 7 */   public static final are c = new are(1, "flat");
/*  6: 8 */   public static final are d = new are(2, "largeBiomes");
/*  7: 9 */   public static final are e = new are(3, "amplified").j();
/*  8:10 */   public static final are f = new are(4, "customized");
/*  9:11 */   public static final are g = new are(5, "debug_all_block_states");
/* 10:13 */   public static final are h = new are(8, "default_1_1", 0).a(false);
/* 11:   */   private final int i;
/* 12:   */   private final String j;
/* 13:   */   private final int k;
/* 14:   */   private boolean l;
/* 15:   */   private boolean m;
/* 16:   */   private boolean n;
/* 17:   */   
/* 18:   */   private are(int paramInt, String paramString)
/* 19:   */   {
/* 20:23 */     this(paramInt, paramString, 0);
/* 21:   */   }
/* 22:   */   
/* 23:   */   private are(int paramInt1, String paramString, int paramInt2)
/* 24:   */   {
/* 25:27 */     this.j = paramString;
/* 26:28 */     this.k = paramInt2;
/* 27:29 */     this.l = true;
/* 28:30 */     this.i = paramInt1;
/* 29:31 */     a[paramInt1] = this;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public String a()
/* 33:   */   {
/* 34:35 */     return this.j;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String b()
/* 38:   */   {
/* 39:39 */     return "generator." + this.j;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public String c()
/* 43:   */   {
/* 44:43 */     return b() + ".info";
/* 45:   */   }
/* 46:   */   
/* 47:   */   public int d()
/* 48:   */   {
/* 49:47 */     return this.k;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public are a(int paramInt)
/* 53:   */   {
/* 54:51 */     if ((this == b) && (paramInt == 0)) {
/* 55:52 */       return h;
/* 56:   */     }
/* 57:54 */     return this;
/* 58:   */   }
/* 59:   */   
/* 60:   */   private are a(boolean paramBoolean)
/* 61:   */   {
/* 62:58 */     this.l = paramBoolean;
/* 63:59 */     return this;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public boolean e()
/* 67:   */   {
/* 68:63 */     return this.l;
/* 69:   */   }
/* 70:   */   
/* 71:   */   private are i()
/* 72:   */   {
/* 73:67 */     this.m = true;
/* 74:68 */     return this;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public boolean f()
/* 78:   */   {
/* 79:72 */     return this.m;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public static are a(String paramString)
/* 83:   */   {
/* 84:76 */     for (int i1 = 0; i1 < a.length; i1++) {
/* 85:77 */       if ((a[i1] != null) && (a[i1].j.equalsIgnoreCase(paramString))) {
/* 86:78 */         return a[i1];
/* 87:   */       }
/* 88:   */     }
/* 89:81 */     return null;
/* 90:   */   }
/* 91:   */   
/* 92:   */   public int g()
/* 93:   */   {
/* 94:85 */     return this.i;
/* 95:   */   }
/* 96:   */   
/* 97:   */   public boolean h()
/* 98:   */   {
/* 99:89 */     return this.n;
/* :0:   */   }
/* :1:   */   
/* :2:   */   private are j()
/* :3:   */   {
/* :4:93 */     this.n = true;
/* :5:94 */     return this;
/* :6:   */   }
/* :7:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     are
 * JD-Core Version:    0.7.0.1
 */